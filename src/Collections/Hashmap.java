package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
    public static void main(String args[]){

        Map<Integer,Integer> mydata= new HashMap<Integer, Integer>();
        mydata.put(32,99);
        mydata.put(4,100);
        mydata.put(null,54);
        mydata.put(39,98);
        mydata.put(23,null);
        mydata.put(45,87);
        mydata.put(11,74);
        mydata.put(4,32);

        Iterator iterator = mydata.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
