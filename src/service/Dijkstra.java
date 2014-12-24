package service;

import model.Edge;
import model.Node;

import java.util.PriorityQueue;

public class Dijkstra {
    private static volatile Dijkstra instance = null;


    private Dijkstra () {}

    public static Dijkstra getInstance() {
        if (instance == null) {
            synchronized (Dijkstra.class) {
                if (instance == null) {
                    instance = new Dijkstra();
                }
            }
        }
        return instance;
    }

    //setting distance for all nodes and saving them in the queue
    //source node has distance equals 0
    public void setAllPathsForSource(Node source) {
        source.setMinDist(0);
        PriorityQueue<Node> nodeQueue = new PriorityQueue<Node>();
        nodeQueue.add(source);

        while(!nodeQueue.isEmpty()) {
            Node node = nodeQueue.poll();

            for (Edge edge : node.getEdges()) {
                Node nextNode = edge.getSourceNext();
                int distanceWeight = node.getMinDist() + edge.getWeight();
                if (distanceWeight < nextNode.getMinDist()) {
                    nodeQueue.remove(nextNode);
                    nextNode.setMinDist(distanceWeight);
                    nextNode.setPrevious(node);
                    nodeQueue.add(nextNode);
                }
            }
        }
    }
}
