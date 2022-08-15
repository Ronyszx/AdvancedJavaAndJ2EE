package com.Enumerations.collections;
import java.util.*;

public class  Linkedlist {

    /*
    Example for Linkedlist in the collections framework

    LinkedList implements the Collection interface.
     It uses a doubly linked list internally to store the elements.
      It can store the duplicate elements.
       It maintains the insertion order and is not synchronized.
        In LinkedList, the manipulation is fast because no shifting is required.


     */

    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<String>();
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
