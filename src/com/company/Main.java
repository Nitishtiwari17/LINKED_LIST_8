package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        LinkedList <String> c1= new LinkedList<String> ();
        c1.add("Red");
        c1.add("Green");
        c1.add("Orange");
        c1.add("black");
        c1.add("blue");
        System.out.println("The first linked list:"+c1);
        LinkedList <String> c2=new LinkedList <String> ();
        c2.add("Pink");
        c2.add("Brown");
        c2.add("Yellow");
        c2.add("Gray");
        c2.add("White");
        System.out.println("The second Linked List:"+c2);
        LinkedList <String> a=new LinkedList <String> ();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list:"+a);
	// write your code here
    }
}
