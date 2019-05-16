package com.javalearning.collection.arraylist;

import java.util.Arrays;

public class ArrayList<E> {

    private int size;
    private static final int DEFAULT_SIZE=10;
    private Object elements[];

    //To initialize the arraylist with the default value when created.
    public ArrayList(){
        elements = new Object[DEFAULT_SIZE];
    }

    //Once the Size of the Array is filled it will create the double of the array size;
    private void ensureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    //Adding Element to the ArrayList
    public void add(E e){
        /* Checking if the array is full, if it is then new array with double the size is created
         * and the existing one is copied in it.
         */
        if(this.size==elements.length){
            ensureCapacity();
        }
        //Adding element to the ArrayList
        elements[size++] = e;
    }

    //To get the value of the object from a perticular location
    public E get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("Index Size is full, i ="+i+" existing size = "+size);
        }
        return (E)elements[i];
    }
}
