package com.Enumerations.collections;
import java.util.*;

public class  Arraylist {

    /*
    Example for arraylist in the collections framework

  The ArrayList class implements the List interface.
   It uses a dynamic array to store the duplicate element of different data types.
    The ArrayList class maintains the insertion order and is non-synchronized.
     The elements stored in the ArrayList class can be randomly accessed.

     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Sam");
        list.add("Rob");
        list.add("Bob");
        list.add("lol");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
