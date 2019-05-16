package com.javalearning.collection.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<E> {

    private E element[];
    private static final int DEFAULT_SIZE=10;
    private int stackPointer;

    public Stack(){
        element = (E[]) new Object[DEFAULT_SIZE];
        stackPointer=0;
    }

    //To Push the element in the Stack
    public void push(E item){
        if(this.size()==element.length){
            this.ensureCapacity();
        }
        element[stackPointer++] = item;
    }

    //To Pop the element from the Stack
    public E pop(){

        if(stackPointer==0){
            throw new IllegalStateException("Wrong Input");
        }
        return element[--stackPointer];
    }

    private void ensureCapacity() {
        int newCapacity = element.length*2;
        element = Arrays.copyOf(element,newCapacity);
    }

    //To verify if the element exist or not
    public boolean contains(E item){
        boolean found = false;
        for(int i=0;i<stackPointer;i++){
            if(element[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    //To access the given element
    public E access(E item){
        while(stackPointer>0){
            E elementTemp = pop();
            if(elementTemp.equals(item)){
                return item;
            }
        }
        throw new IllegalArgumentException("Data not available in the Stack : "+item);
    }

    public int size(){
        return stackPointer;
    }
}
