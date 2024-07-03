package List;
import java.util.LinkedList;
public class Vertex {
    // A vertex has a label and a List of Edges 
    //definition of Edge is given in respective class
    String label;
    LinkedList<Edge> EdgeList; //adjacency List

    public  Vertex(){
        EdgeList = new LinkedList<>();
    }

    public Vertex(String label) {
        this();
        this.label = label;
    }
}
