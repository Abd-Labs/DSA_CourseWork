package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class binarytree {
  
    Node root;
    
 
    public void inserting() {
        //hard coding a binary tree
        root = new Node(8);
        root.left = new Node(10);
        root.right = new Node(7);
        root.left.left = new Node(13);
        root.left.left.right = new Node(2);
        root.left.right = new Node(3);
        root.left.right.right = new Node(4);
        root.left.right.left = new Node(9);
        root.right.left = new Node(32);
        root.right.right = new Node(11);

    }
    boolean isleaf(Node node){
        if (node.left!=null && node.right!=null) {
            return true;
        }
        else return false;
    }
    Node leftChild(Node node) {
        return node.left;
    }

    Node rightchild(Node node) {
        return node.right;
    }

    boolean hasLeft(Node node) {
        return !(node.left == null);
    }

    boolean hasright(Node node) {
        return !(node.right == null);
    }

    void preorder(Node root) {

        if (root == null) {
            return;
        } else {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    void inorder(Node root) {

        if (root == null) {
            return;
        } else {

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root == null) {
            return;
        } else {

            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
     
    Node iterativeBFS(Node root, int key) {
        // for BFS if the root is not null
        if (root != null) {
            //create a queue
            Queue<Node> q = new LinkedList<>();
            //create a temporary variable and initialize it with root of tree
            Node temp = root;
            q.add(temp); //add it to the queue
            int i=0;
            //iterate till the queue becomes empty
            while (!q.isEmpty()) {
                i++;
                //dequeue element from the queue's front
                temp = q.remove();
                // if it is equal to key we are searching for
                if (temp.data == key) {
                    return temp; //return the Node
                    //if the element dequeued has left or right child 
                }if (hasLeft(temp)) {
                    q.add(temp.left); //add left child to the queue
                }if (hasright(temp)) {
                    q.add(temp.right); // add right child to the queue  
                }
            }
        }
        // if the required key is not found return null
        return null;
       }
       
    //recursive method to search an element in a Binary Tree through level by level search(Breadth first Search)
    // method takes a queue for type Node , root of the tree we want to search in and the node we want to search
    // method will return true if the Node is present in the tree
       Node recursiveBFS(Queue<Node> q , Node root, int key ){
           Node temp=null;
           
           if (root.data==key) {
               //if the node is found return true in temporary variable
               return root;
           }
           // if node doesn't match the key 
           //push its left and right child in the queue (if any)
           if (hasLeft(root)) {
               q.add(root.left);
           }
           if (hasright(root)) {
               q.add(root.right);
           }
           //recursive call for level by level search
           if(!q.isEmpty())
           temp = recursiveBFS(q, q.remove(), key);
         
           return temp;
       }
       //method to return parent of a given Node
       Node parent(Node node,Node root){
           Node temp=null; ///variable to return refrence of parent node accross recursive calls
           
           if (root!=null) {
               
            //if node whose parent is to be find is the root of main tree   
           if (node==this.root) {
               return null; //return null
           }
           //if root's left or right child is equal to node return root as parent
           else if (root.left==node || root.right==node) {
               return root;
           }
           else{
               //else look for parent in left and right subtree
               temp= parent(node, root.left);
               if (temp ==null) 
               temp= parent(node, root.right);
           }
         }
           
           return temp;
       }
    // method to return sibling of a given Node of a binary tree
       Node Sibling(Node node,Node root){  
           //get parent of the node
           Node parent = parent(node, root);
           Node temp=null;
           //returning sibling of the node ...null will be returned incase
           if (parent!=null) {
           if (parent.left==node) {
               temp = rightchild(parent);
           }
           else
               temp= leftChild(parent);
           }
           
           return temp;
       }
       //to delete a node in a binary tree we replace it with right most deepest node 
       //of the tree  and delete the deepest right most node
       //return type is kept Node just to match its signature with delete method of BST class so that it can be overriden
       public Node delete(int key,Node root){
           // getting the refrence of Node to be deleted
           Node targetNode = iterativeBFS(root, key);
           if(targetNode==null) {
               System.out.println("No such Node present");
               return null;
           }
           
           Node rightmost = this.root;
           // getting the refrence of the right most deepest node
           while (rightmost!=null) {
               if (rightmost.right==null) { 
                   break;
               }
               else rightmost=rightmost.right;
           }
           //swapping the data of both nodes
           int temp=targetNode.data;
           targetNode.data= rightmost.data;
           rightmost.data=temp;
           
           // finding the parent of rightmost node to delete it
           Node parent = parent(rightmost, root);
           parent.right=null;
           
           return root;
       }
       
       public int NodeLevel(Node root,int key){
           //this method is similar like Iterative BFS 
           //difference is we add a null to the queue each time a level of tree is completely added to the queue
           
           if (root!=null) {
                Queue<Node> q = new LinkedList<>();
                
                Node temp = root;
                q.add(temp);
                q.add(null);
                int i=0;
                
                while (!q.isEmpty()) {                   
                   
                    temp = q.remove();
                    //if element removed from front of the queue is null it means a level has
                    //been completed and we increase the i counter by 1 and add another null to the Rear of queue
                    if (temp==null) {
                        i++;
                        q.add(null);
                        continue;
                    }
                    if (temp.data==key) {
                        return i;
                    }
                    if (hasLeft(temp)) {
                        q.add(temp.left);
                    }
                    if (hasright(temp)) {
                        q.add(temp.right);
                    }  
                 }
               } 
           return -1;
           }
       
       public int Depth(Node root){
           if (root==null) {
               return 0;
           }
           //finding the maximum height from left and right subtrees and adding one to 
           // the maximum and return it
           return Math.max(Depth(root.left),Depth(root.right))+1;
       }
       public boolean isfull(Node root){
           boolean temp= false;
           //if root is null then it is a full binary tree
           if (root==null) {
               return true;
           }
           //if root is not null and has both left and right childs then return true
           else if (!hasLeft(root) && !hasright(root)) {
               return true;
           }
           else{
               //check if left subtree is full
               temp = isfull(root.left);
               if (!temp) //if left subtree is not full then no need to check right subtree
                temp = isfull(root.right);
           }
           return temp;
       }
       public boolean SameLevel(Node root,int key1,int key2){
           if (NodeLevel(root, key1)==NodeLevel(root, key2)) {
               return true;
           }
           else
               return false;
       }
       public boolean equal(Node root1,Node root2){
           //if either of roots is null return false
           if ((root1==null && root2!=null)|| (root1!=null && root2==null)) {
               return false;
           }
           //if both roots are null return true
           if (root1==null && root2==null) {
               return true;
           }
           //if data of both roots is same
           if (root1.data==root2.data) {
               //check recursively if left and right subtree are equal
              return  (equal(root1.left, root2.left)&& equal(root1.right, root2.right));
           }
           else return false;
       }
       public boolean same(Node root1,Node root2){
           //if either of roots is null return false
           if ((root1==null && root2!=null)|| (root1!=null && root2==null)) {
               return false;
           }
            //if both roots are null return true
           if (root1==null && root2==null) {
               return true;
           }
           else{
               return same(root1.left, root2.left)&&same(root1.right, root2.right);
           }
       }
       public boolean Isomorphic(Node root1,Node root2){
           
           // if both roots are null it is isomorphic
           if (root1==null && root2==null) {
               return true;
           }
           //if both roots are leaf nodes return true
           else if (isleaf(root1) && isleaf(root2)) {
               return true;
           }
           //if both roots have same number of childs
           else if (hasLeft(root1) && hasLeft(root2)) {
               if (hasright(root1) && hasright(root2)) {
                   //check if left subtree is isomorphic
                   if (Isomorphic(root1.left, root2.left)) {
                       //if yes then check if the right subtree is Isomorphic
                       return Isomorphic(root1.right, root2.right);
                   }
               }
           }
           
           return false;
       }
       
       public void PrintChildren(Node node , int key){
           if (node==null) {
               return;
           }
           if (node.data== key) {
               if (hasLeft(node)) {
                   System.out.print("Left child " + node.left.data);
               }
               if (hasright(node)) {
                   System.out.println("  Right Child "+ node.right.data);
               }
           }
           else{
               PrintChildren(node.left, key);
               PrintChildren(node.right, key);
           }
       }
    }