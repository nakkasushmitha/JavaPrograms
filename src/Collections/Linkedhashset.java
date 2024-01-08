package Collections;

// Importing required classes
import java.util.*;

// Main class
// AddElementsToLinkedHashMap
public class Linkedhashset {

    // Main driver method
    public static void main(String args[])
    {

        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashSet<Integer> mydata = new LinkedHashSet<Integer>();

        // Add mappings to Map
        // using put() method
        mydata.add(32);
        mydata.add(null);
        mydata.add(12);
        mydata.add(72);
        mydata.add(39);
        mydata.add(32);
        mydata.add(1);

        Iterator iterator = mydata.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

