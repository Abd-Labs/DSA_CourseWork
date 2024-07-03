
package Hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;


public class Hashmap <K,V> {
    
    LinkedList<Node> [] bucket;
    int size;
    int n; // total entries in hashmap
    
    public class Node{
        K key;
        V value;
        
        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }
    
    public Hashmap(){
        size=8;
        bucket = new LinkedList[size];
        n=0;
        
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<>();
        }
    }
    
    public int hashfunction(K key){
        
        int hash = hashCode();
        
        return Math.abs(hash)%size;
        
    }
    public void Rehashing(){
        double lambda =(double)n/size;
        // if threshold has not reached then return
        if (lambda<3) {
            return;
        }
        // if yes then rehash the table
        else{
            LinkedList<Node> [] old = bucket;
            size *=2;
            bucket = new LinkedList[size];
            
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }
            
            for (LinkedList<Node> list : old) {
                for (Node node : list) {
                    put(node.key, node.value);
                }
            }
        }
    }
    
    public void put (K key,V value){
         int bi = hashfunction(key);
         int index = SearchinLL(key);

        if (index==-1) {
            bucket[bi].add(new Node(key, value));
            n++;
        }
        else{
            bucket[bi].get(index).value=value;
        }
        
    }
    
    public boolean contains(K key){
        
         int index = SearchinLL(key);
        
        if (index==-1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public int SearchinLL(K key){
        
        int index = hashfunction(key);
        
        LinkedList<Node> list = bucket[index];
        
        for (int i=0; i<list.size();i++) {
            
            if ( list.get(i).key.equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    public V remove(K key){
         int bi = hashfunction(key);
         int index = SearchinLL(key);
         
         if(index==-1){
             return null;
         }
         Node node = bucket[bi].get(index);
         
         bucket[bi].remove(index);
         n--;
         
         return node.value;
    }
    public V get(K key){
        
         int bi = hashfunction(key);
         int index = SearchinLL(key);
         
         if(index==-1){
             return null;
         }
         Node node = bucket[bi].get(index);
         
         return node.value;
    }
    
    public ArrayList<K> keySet(){
        ArrayList<K> list = new ArrayList<>();
        
        for (LinkedList<Node> ll : bucket) {
                for (Node node : ll) {
                    list.add(node.key);
                }
            }
        
        return list;
    }
}
