package com.javalearning.collection.linkedlist.singlylinklist;

public class Node<T> {

    public Node<T> next;
    public T data;

    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
