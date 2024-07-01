//program using Tree Map for inserting the student objects with the roll number as key.

package apjfsa;
//importing Tree Map.
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Creating a TreeMap with Integer keys and String values
        TreeMap<Integer,String> stuRollNo = new TreeMap<Integer,String>();
        
        // Adding key-value pairs to the TreeMap
        stuRollNo.put(01, "Bhuvanasri");
        stuRollNo.put(02, "Shailaja");
        stuRollNo.put(03, "Yashwanth");
        stuRollNo.put(04, "Navya");
        stuRollNo.put(05, "Jaya");
        stuRollNo.put(06, "Vishwa");
        
        // Printing the TreeMap (toString method of TreeMap is called implicitly)
        System.out.println(stuRollNo);
        
        // Checking if a specific key exists
        System.out.println(stuRollNo.containsKey(05));  // Output: true
        
        // Getting the first (lowest) key
        System.out.println(stuRollNo.firstKey());  // Output: 1
        
        // Getting a set view of the keys contained in the map
        System.out.println(stuRollNo.keySet());
        
        // Getting a collection view of the values contained in the map
        System.out.println(stuRollNo.values());
        
        // Getting the hash code of the TreeMap object
        System.out.println(stuRollNo.hashCode());
        
        // Getting the last (highest) key
        System.out.println(stuRollNo.lastKey());  // Output: 6
        
        // Getting the number of key-value mappings in the TreeMap
        System.out.println(stuRollNo.size());
        
        // Getting the last (highest) entry in the TreeMap
        System.out.println(stuRollNo.lastEntry());
    }
}