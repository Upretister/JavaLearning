package com.javalearning.collection.practice;

import com.javalearning.collection.linkedlist.pluralisght.LinkedList;
//import com.javalearning.collection.linkedlist.singlylinklist.LinkedList;
public class LinkedListTestPlu {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        list.add("Test5");
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));
    list.insert("Test New",2);
        //list.add("Test New",3);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        list.removeAt(2);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        //####################################
        System.out.println("##############################");

    }
}
