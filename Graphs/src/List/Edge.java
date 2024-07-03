
package List;

public class Edge {
    /* 
    there will be a List of Vertex in Graph class
    Each Vertex in a that list will have a List of Edges 
    An edge has a source Vertex, destination Vertex and a weight/distance
    A vertex can act as source for Multiple Edges while destination and weight will be stored in object of
    edge class
    
    */
    
    Vertex destination;
    int weight;

    public Edge(Vertex destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
    
}