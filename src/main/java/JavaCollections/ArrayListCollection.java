package JavaCollections;

import java.util.*;

public class ArrayListCollection {

    public static void main(String args[]){

        ArrayList<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Boy");
        list.add("Cat");

        System.out.println(list.toString());


        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println("The Array Values is :" + it.next().toString());
        }


    }

}
