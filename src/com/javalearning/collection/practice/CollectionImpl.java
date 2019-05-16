package com.javalearning.collection.practice;

import com.javalearning.collection.linkedlist.singlylinklist.LinkedList;

public class CollectionImpl {

    public static void main(String args[]){

        LinkedList<String> list = new LinkedList<>();
        list.add("Test0");
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        list.add("Test5");
        list.add("Test6");
        list.add("Test7");
        list.add("Test8");
        list.add("Test9");
        list.add("Test10");

//        System.out.println("Size:: "+list.size());
//        for(int i=0;i<list.size();i++)12{
//            System.out.println("Values: "+list.get(i));
//        }

        //list.add("Test123",0);
        //list.add("Test123",3);
        list.add("Test123",0);

//        System.out.println("New Size:: "+list.size());
//        for(int i=0;i<list.size();i++){
//            System.out.println("New Values:"+list.get(i)+" :: "+i);
//        }

        list.remove(5);
        System.out.println("New Size:: "+list.size());
        for(int i=0;i<list.size();i++){
            System.out.println("New Values: "+list.get(i));
        }
    }
}
