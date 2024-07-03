
package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter 1 for binary tree and 2 for binary search tree ");
        int opt = in.nextInt();
        
        if (opt==1) {
            
            binarytree tree = new binarytree();
            binarytree tree2 = new binarytree();
           
            //a tree is hard coded
            tree.inserting();
            tree2.inserting();
            tree.PrintChildren(tree.root, 4);
//            System.out.println(tree.recursiveBFS(new LinkedList<Node>(), tree.root, 32));
//            tree2.delete(32, tree2.root);
//            System.out.println(tree.same(tree.root, tree2.root));
//            tree.Depth(tree.root);
//            System.out.println(tree.NodeLevel(tree.root, 9));
//            tree.inorder(tree.root);
//            
//            System.out.println(tree.iterativeBFS(tree.root, 32));
//            
//            System.out.println(tree.Sibling(tree.root.left.right.left, tree.root));
//            System.out.println(tree.Sibling(tree.root.right.left, tree.root));
//            
//            tree.delete(3,tree.root);
//            tree.inorder(tree.root);
        }
        if (opt==2) {
            
            BST t = new BST();
            
            t.insert(t.root,8);
            
            System.out.println(t.root);
             t.insert(t.root,5);
             t.insert(t.root,3);
              t.insert(t.root,4);
               t.insert(t.root,9);
                t.insert(t.root,11);
                
                t.Depth(t.root);
                
                t.preorder(t.root);
                
                t.Search(t.root, 4);
                t.Search(t.root, 6);
                
       
                
                t.delete(4, t.root);
                
                t.preorder(t.root);
        }
    }
    
}
