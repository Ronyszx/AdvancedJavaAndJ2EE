package com.Enumerations.collections;
import java.util.*;

public class  vector {

    /*
   Vector uses a dynamic array to store the data elements.
    It is similar to ArrayList.
     However, It is synchronized and contains many methods that are not the part of Collection framework.
     */

    public static void main(String[] args) {
        Vector <String> list = new Vector<>();
        list.add("Ravi");
        list.add("Sam");
        list.add("Rob");
        list.add("Bob");
        list.add("lol");
        list.add("Ravi");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
