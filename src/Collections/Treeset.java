package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

    // Main driver method
    public static void main(String args[])
    {

        // Initialization of a LinkedHashMap
        // using Generics
        TreeSet<Integer> mydata = new TreeSet<>();

        // Add mappings to Map
        // using put() method
        mydata.add(32);
        mydata.add(30);
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
