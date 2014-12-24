package model;

//model for Edges between Nodes
//stores its weight and next node
public class Edge {
    private Node sourceNext;
    private int weight;

    public Edge(Node sourceNext, int weight) {
        this.sourceNext = sourceNext;
        this.weight = weight;
    }

    public Node getSourceNext() {
        return sourceNext;
    }

    public void setSourceNext(Node sourceNext) {
        this.sourceNext = sourceNext;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
