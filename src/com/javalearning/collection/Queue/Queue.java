package com.javalearning.collection.Queue;

import javax.lang.model.element.Element;
import javax.swing.*;
import java.util.Arrays;

public class Queue<E> {

    private E[] element;
    private static final int DEFAULT_SIZE=10;
    private int front;
    private int end;

    public Queue(){
        element =  (E[]) new Object[DEFAULT_SIZE];
        this.front = -1;
        this.end = -1;
    }

    private void ensureCapacity() {
        int newCapacity = element.length*2;
        element = Arrays.copyOf(element,newCapacity);
    }

    public int size(){
        //If Queue is empty return 0
        if(front==-1 && end==-1){
            return 0;
        }//Otherwise we add one to get the inclusive substraction value rather than extracting
        else{
            return end - front +1;
        }
    }

    public void enQueue(E item){
        //Check if the queue is full
//        if((end+1) % element.length == front ){
//          throw new IllegalStateException("Queue is full");
//        }
        if(element.length==this.size()){
            this.ensureCapacity();
        }
        //Otherwise check to see if any items have been added to the queue yet
        if(size()==0){
            front++;
            end++;
            element[end] = item;
        }
        //Otherwise add the item to the end of the queue
        else{
            end++;
            element[end] = item;
        }

    }

    public E deQueue(){
        E item = null;
        //if queue is empty we cant dequeue anything
        if(size()==0){
            throw new IllegalStateException("Can't deque because the queue is empty!");
        }
        //Otherwise if this is the last item in the queue, the queue need to reset to empty
        else if(front==end){
            item = element[front];
            element[front] = null;
            front=-1;
            end = -1;
        }
        //Otherwise grab the front of the queue,return it and adjust the pointer
        else{
            item = element[front];
            element[front] = null;
            front++;
        }
        return item;
    }

    public boolean contains(E item){

        boolean found = false;
        //If queue is empty just immidiately return false
        if(size()==0){
            return found;
        }
        for (int i=front;i<end;i++){
            if(element[i].equals(item)){
                found = true;
                break;
            }
        }

        return found;
    }

    public E access(int position){

        if(size()==0 || position>size()){
            throw new IllegalArgumentException("No item in the queue or position are is greater than the queue holds");
        }

        int trueIndex=0;
        for (int i=front;i<end;i++){
            if(trueIndex== position){
                return element[i];
            }
            trueIndex++;
        }
        //If we did not find an item throw an exception
        throw new IllegalArgumentException("Could not get Queue item at position "+position);
    }
}
