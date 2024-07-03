
package Matrix;

public class Graph {
    
    int adjacencyMatrix[][];
    Vertex VertexList[];
    int n;
    
    public Graph(){
        n=-1;
        adjacencyMatrix = new int[5][5];
        VertexList = new Vertex[5];
    }
    
    public int noofVertices(){
        return n;
    }
    
    int SearchVertex(Vertex v){
        if (n==-1) {
           return -1;
        }
        else{
            for (int i = 0; i < n; i++) {
                if (VertexList[i]==v) {
                    return i;
                }
            }
        }
        return -1;
    }
    void insertVertex(Vertex v){
        if (n+1>VertexList.length) {
            return;
        }
        else{
            n++;
            VertexList[n]=v;
        }
    }
    public void addEdge(Vertex x, Vertex y,int weight)
{
    // checks if the vertex exists in the graph
    int X =SearchVertex(x);
    int Y = SearchVertex(y);
    
    if (X==-1 || Y==-1) {
        System.out.println("Vertex does not exists!");
    }
    else {
        adjacencyMatrix[X][Y] = weight;
        adjacencyMatrix[Y][X] = weight;
    }
}
    public int outGoingEdges(Vertex v){
        int location = SearchVertex(v);
        
        int total=0;
        for (int j = 0; j < 10; j++) {
            if (adjacencyMatrix[location][j]!=0) {
                total++;
            }
        }
        return total;
    }
     public int IncomingEdges(Vertex v){
        int location = SearchVertex(v);
        
        int total=0;
        for (int i = 0; i < 10; i++) {
            if (adjacencyMatrix[i][location]!=0) {
                total++;
            }
        }
        return total;
    }

}
