
package Hashmaps;

public class Main {
    public static void main(String[] args) {
        
        Hashmap<String, Double> map = new Hashmap<>();
        
        map.put("Hyderabad", 1.0);
        map.put("Lahore", 1.5);
        map.put("Karachi", 2.5);
        map.put("Peshawar", 0.5);
        map.put("Faisalabad", 0.75);
        
        
        System.out.println(map.keySet());
        
        map.remove("Peshawar");
        
         System.out.println(map.keySet());
    }
}
