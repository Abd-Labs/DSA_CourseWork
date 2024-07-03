
package Trees;

public class BST extends binarytree{
   /* 
    ALTHOUGH INSERTION AND SEARCHING ARE DIFFERENT IN BINARY SEARCH TREE 
   BUT WE CAN'T OVERRIDE THESE METHOD from parent class BECAUSE SIGNATURE OF THESE
    METHODS ARE DIFFERENT IN PARENT CLASS
   */ 
    public BST(){
        
    }
    
     Node insert(Node root,int data){
        //if root is null place the data there
        if (root==null) {
            root= new Node(data);
            return root;
        }
        // recursive call for left subtree if root's data is greater 
        if (root.data>data) {
           root.left =  insert(root.left,data);
        }
        //recursive call for right subtree
        else{
           root.right= insert(root.right, data);
        }
        return root;
    }
    
     
     Node Search(Node root,int key){
        
        if (root == null) {
            return null;
        }
        //return root if its data matches the key
        if (root.data==key) {
            return root;
        }
        //if root's data is greater than key then search in left subtree
        else if (root.data>key) {
           return Search(root.left, key);
        }
        //if root's data is less than key then search in right subtree
        else {
            return Search(root.right, key);
        }
    }
     //delete method is overrided
    @Override
    public Node delete(int key,Node root) {
        if (root==null) {
            return null;
        }
        
        if (key<root.data) {
            root.left= delete(key, root.left);
        }
        else if (key>root.data) {
            root.right = delete(key, root.right);
        }
        else{
            if (root.left==null) {
                return root.right;
            }
            else if (root.right==null ) {
                return root.left;
            } 
            else{
                Node temp = inorderSuccessor(root);
                root.data = temp.data;
                root.right = delete(temp.data, root.right);
            }
        }
        
        return root;
    }
    
    public Node inorderSuccessor(Node root){
        Node temp=root;
        while (temp.left!=null) {            
            temp=temp.left;
        }
        return temp;
    }
     
}
