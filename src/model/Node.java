package model;

import java.util.ArrayList;
import java.util.List;

//model for Node with implemented interface Comparable so it will be easier to use PriorityQueue
//stores id, name, previous Node and list of edges
//and i'm saving min distance here
public class Node implements Comparable<Node>{
    private int id;
    private String name;
    private Node previous;
    private int minDist = 200000;
    private List<Edge> edges;

    public Node(int id, String name) {

        this.id = id;
        this.name = name;
        this.edges = new ArrayList<Edge>();

    }

    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int getMinDist() {
        return minDist;
    }

    public void setMinDist(int minDist) {
        this.minDist = minDist;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.minDist, other.getMinDist());
    }

    @Override
    public String toString() {
        return name;
    }
}
