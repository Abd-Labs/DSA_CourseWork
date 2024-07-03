package List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//NOTE: IT WILL BE A DIRECTED GRAPH
public class Graph {
    //each Graph is represented by a ArrayList of Vertex  where definition of Vertex is given in respective class
    ArrayList<Vertex> VertexList;
    
    public Graph(){
        VertexList=new ArrayList<>();
    }
    public void PrintGraph(){
        
        for (int i = 0; i < VertexList.size(); i++) {
            Vertex temp = VertexList.get(i);
            
            System.out.print("Vertex: "+ temp.label + " is connected to theses Vertices ");
            
            LinkedList<Edge> li = temp.EdgeList;
            for (int j = 0; j < li.size(); j++) {
                System.out.print(li.get(j).destination.label+ ", ");
            }
            System.out.println();
        }
    }
    
    public void AddVertex(String data){
        if (Search(data)>-1) {
            return;
        }
        VertexList.add(new Vertex(data));
    }
    public int totalVertices(){
        return VertexList.size();
    }
    
    public int Search(String key){
        for (int i = 0; i < VertexList.size(); i++) {
            //searching the key in the vertexlist by comparing with label of each vertex
            if (VertexList.get(i).label.equalsIgnoreCase(key))
            {
                return i;
            }
        }
        return -1;
    }
    public void AddEdge(String Source,String Destination,int weight){
        
        //getting the index of source and destination Vertex in Vertex List
        int src = Search(Source);
        int dest = Search(Destination);
        
        //if any of Vertex don't exist in graph then return with message
        if(src==-1 || dest==-1){
         System.out.println("one of the vertex doesn't exist ");
         return;
        }
        //if an Edge already Exists then return
        if(hasEdge(VertexList.get(src), VertexList.get(dest))) return;
        //a        if(hasEdge(VertexList.get(src), VertexList.get(dest)));dding an edge from source vertex to destination vertex 
        VertexList.get(src).EdgeList.add(new Edge(VertexList.get(dest), weight));
        
        // .. WE CAN ADD AN EDGE FROM DESTINATION TO SOURCE TO MAKE THE GRAPH UNDIRECTED
    }
   //to check if v1 already has an Edge towards v2
    public boolean hasEdge(Vertex v1,Vertex v2){
        
        LinkedList<Edge> li = v1.EdgeList;
        //iterate over the edge list of the vertex v1
        for (int i = 0; i < li.size(); i++) {
            //if v2 is equal to destination of any Edge in List return true
            if (li.get(i).destination==v2) {
                return true;
            }
        }
        return false;
    }
         //this method will take a string as input , find the repective vertex and
     //print the label of all the vertices towards which it has an outgoing edge 
    public int outgoingEdges(String data){
        int location = Search(data);
        if(location==-1) return -1;
        //returning the size of Edge list of given Vertex
        return VertexList.get(location).EdgeList.size();
    }
    
    public int incomingEdges(String data){
         int location = Search(data);
        if(location==-1) return -1;
        int total=0;
        Vertex v = VertexList.get(location);
        //creating a temporary linked List of type Edge
        LinkedList<Edge> temp = new LinkedList<>();
        
        //store all the Edges of Graph in this temp list
        for (int i = 0; i < VertexList.size(); i++) {
            if(i==location) continue;
            
            temp.addAll(VertexList.get(i).EdgeList);
        }
        //Now iterate over this temp list and increment total variable if the given vertex
        //matches the destination Vertex of any Edge in List
        
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).destination==v) {
                total++;
            }
        }
        return total;
    }
    // method to delete edge between a given source and destination
    public void removeEdge(String source,String destination){
         //getting the index of source and destination Vertex in Vertex List
        int src = Search(source);
        int dest = Search(destination);
        
        //if any of Vertex don't exist in graph then return with message
        if(src==-1 || dest==-1){
         System.out.println("No such Edge exist ");
         return;
        }
        Vertex v1 =VertexList.get(src);
        Vertex v2 = VertexList.get(dest);
        //if there isn't any Edge then return
        if(!hasEdge(v1, v2)) return;
        //else delete the edge
        for (int i = 0; i < v1.EdgeList.size(); i++) {
            Edge e = v1.EdgeList.get(i);
            
            if (e.destination==v2) {
                v1.EdgeList.remove(e);
            }
        }
    }
    public void removeVertex(String label){
        int location = Search(label);
        if(location==-1) return;
        
        Vertex v = VertexList.get(location);
        
        //to delete inward edges iterate over the vertex list
        for (int i = 0; i < VertexList.size(); i++) {
            if(i==location) continue;
            Vertex temp = VertexList.get(i);
            //iterate over the edge list of each vertex 
            for (int j = 0; j <temp.EdgeList.size(); j++) {
                //if our vertex to be deleted matches the destination of any Edge in Graph
                if (temp.EdgeList.get(j).destination==v) {
                    temp.EdgeList.remove(j); //remove the Edge
                }
            }
        }
        VertexList.remove(location);
        
    }
    //breadth first search 
    public void BFS(String label){ //user will pass the label of the vertex
        
          int location = Search(label);
          if(location==-1) return; //Vertex doesn't exist
          
          boolean visited[] = new boolean[VertexList.size()];
          
          Queue<String> q = new LinkedList<>();
          q.add(label);
          
          while(!q.isEmpty()){
              
              label = q.remove();
              location = Search(label);
              
              // if vertex isn't visited already
              if(!visited[location]){
                  //print it and mark it visited;
              System.out.println(label + "  ");
              visited[location] = true;
              }
              Vertex v = VertexList.get(location);
              
              for (int i = 0; i < v.EdgeList.size(); i++) {
                  q.add(v.EdgeList.get(i).destination.label); //add all the neighbours of vertex to the queue
              }
          }
    }
    
    
}
