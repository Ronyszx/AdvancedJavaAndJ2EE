package com.Enumerations.collections;
/*
Implementation of stack

The stack is the subclass of Vector.
 It implements the last-in-first-out data structure, i.e., stack.
  The stack contains all of the methods of Vector class and also provides its methods
   like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

 */

import java.util.Iterator;
import java.util.Stack;

public class stack {

    public static void main(String[] args) {
       Stack<String> list = new Stack<String>();
        list.push("Ravi");
        list.push("Sam");
        list.push("Rob");
        list.push("Bob");
        list.push("lol");
        list.push("Ravi");
        list.pop();

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    }
