package Collections;
import java.util.*;
public class Hashset {

    // Main driver method
    public static void main(String args[])
    {

        // Initialization of a LinkedHashMap
        // using Generics
        Set<Integer> mydata = new HashSet<Integer>();

        // Add mappings to Map
        // using put() method
        mydata.add(32);
        mydata.add(null);
        mydata.add(12);
        mydata.add(72);
        mydata.add(39);
        mydata.add(32);

        Iterator iterator = mydata.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
    }
}
}
