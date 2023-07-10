package com;

import java.util.ArrayList;
import java.util.Iterator;

 

public class ForEach {

 

    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add("Apple");
        al.add("Orange");
        al.add("Grapes");
        al.add("Mango");
        al.add("Banana");

        Iterator i=al.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("=====for each=====");

        al.forEach(fruits->{
            System.out.println(fruits);
        });

        int arr[]= {1, 34, 2, 5, 56, 6, 3, 23};

        for(int i1=0; i1<arr.length; i1++) {
            System.out.println(arr[i1]);
        }
        System.out.println("==========");

        for(int j:arr) {
            System.out.println(j);
        }
    }
}