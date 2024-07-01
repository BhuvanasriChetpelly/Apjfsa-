//program using  Hash Map insert Country with its codes as key.

package apjfsa;
//importing Hash Map
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creating a HashMap with Integer keys and String values
        HashMap<Integer,String> countryCodes = new HashMap<Integer,String>();
        
        // Adding key-value pairs to the HashMap
        countryCodes.put(01,"US");
        countryCodes.put(91,"India");
        countryCodes.put(07,"Russia");
        countryCodes.put(61,"Australia");
        countryCodes.put(86,"China");
        countryCodes.put(92,"Pakistan");
        
        // Printing the HashMap (toString method of HashMap is called implicitly)
        System.out.println(countryCodes);
        
        // Checking if a specific key exists
        System.out.println(countryCodes.containsKey(23));  // Output: false
        
        // Checking if a specific value exists
        System.out.println(countryCodes.containsValue("US"));  // Output: true
        
        // Getting the hash code of the HashMap object
        System.out.println(countryCodes.hashCode());
        
        // Getting the size (number of key-value mappings) of the HashMap
        System.out.println(countryCodes.size());
        
        // Getting the value associated with a specific key
        System.out.println(countryCodes.get(86));  // Output: China
        
        // Getting a set view of the mappings contained in the map
        System.out.println(countryCodes.entrySet());
        
        // Getting a set view of the keys contained in the map
        System.out.println(countryCodes.keySet());
        
        // Getting a collection view of the values contained in the map
        System.out.println(countryCodes.values());
    
    }
}   