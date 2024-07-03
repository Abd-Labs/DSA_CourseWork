
package List;

public class Main {
    public static void main(String[] args) {
        
        Graph g = new Graph();
        
        g.AddVertex("Lahore");
        g.AddVertex("Karachi");
        g.AddVertex("Faisalabad");
        g.AddVertex("Islamabad");
        g.AddVertex("Peshawar");
        
        g.AddEdge("lahore", "karachi", 1300);
        g.AddEdge("lahore", "islamabad", 450);
        g.AddEdge("faisalabad", "karachi",  1000);
        g.AddEdge("Islamabad", "peshawar", 350);
        g.PrintGraph();
        
        g.removeEdge("faisalabad", "karachi");
        g.removeVertex("peshawar");
        g.PrintGraph();
    }
}
