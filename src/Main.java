import model.Edge;
import model.Node;
import service.Dijkstra;


//since i was in a hurry, i left simple implementation for this task without any checking for city names or digit size
public class Main {
    public static void main(String[] args){
        Node first, second, third, fourth;

        first = new Node(1, "gdansk");
        second = new Node(2, "bydgoszcz");
        third = new Node(3, "torun");
        fourth = new Node(4, "warszawa");

        first.addEdge(new Edge(second, 1));
        first.addEdge(new Edge(third, 3));

        second.addEdge(new Edge(first, 1));
        second.addEdge(new Edge(third, 1));
        second.addEdge(new Edge(fourth, 4));

        third.addEdge(new Edge(first, 3));
        third.addEdge(new Edge(second, 1));
        third.addEdge(new Edge(fourth, 1));

        fourth.addEdge(new Edge(second, 4));
        fourth.addEdge(new Edge(third, 1));

        //gdansk warszawa
        Dijkstra.getInstance().setAllPathsForSource(first);
        System.out.println("Shortest for gdansk to warszawa " + fourth.getMinDist());

        //bydgoszcz warszawa
        Dijkstra.getInstance().setAllPathsForSource(second);
        System.out.println("Shortest for bydgoszcz to warszawa " + fourth.getMinDist());
    }
}
