package com.javalearning.collection.linkedlist.singlylinklist;

public class LinkedList<T> {

    public Node<T> head;
    public Node<T> tail;
    public int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        return this.size;
    }

    //Clearing the whole list
    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Adding an element to the LinkedList
    public boolean add(T element){
        if(isEmpty()){
            head = new Node<T>(element,null);
            tail = head;
        } else{
            tail.setNext(new Node<T>(element,null));
            tail = tail.getNext();
        }
        size++;
        return true;
    }

    //Adding an element at the ith position of the LinkedList
    public void add(T element, int i){
        //If size is greater or lesser
        if(i>this.size() || i<0){
            throw new IndexOutOfBoundsException("List if full");
        }
        //Inserting at the tail position
        if(i==this.size()){
            this.add(element);
            return;
        }
        //Inserting at the head
        if(i==0){
            Node<T> startNode = null;
            startNode = head;
            head = new Node<T>(element,null);
            head.setNext(startNode);
            //tail = head;
        }else{                      //Insertion in the middle
            Node<T> currentNode = head;
            for(int j=0;j<i-1;j++){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node<T>(element,currentNode.getNext()));
        }
        size++;
    }


    //Fetching an element
    public T get(int i){
        if(i<0||i>=this.size()){
            throw new IndexOutOfBoundsException("Wrong Input Value");
        }
        if(i<this.size()-1){
            Node<T> currentNode = head;
            for(int j=0;j<i;j++){
                currentNode = currentNode.getNext();
            }
            // System.out.println("CurrentData: "+currentNode.getData());
            return currentNode.getData();
        }
        return tail.getData();
    }

    //Deleting an element
    public void remove(int i) {
        System.out.println("Value of i: "+i+" Size :: "+this.size());
        if (i < 0 || i > this.size()) {
            throw new IndexOutOfBoundsException("Not proper Size");
        }
        //Deleting from the start
        if (i == 0) {
            head = head.getNext();
            size--;
            return;
        }

        if(i>0 && i<this.size()){
            Node<T> currentNode = head;
            Node<T> previousNode = null;
            for(int j=0;j<i;j++){
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            previousNode.setNext(currentNode.getNext());
            size--;
            return;
        }

        if(i==this.size()){
            System.out.println("Last Node Condition");
            Node<T> currentNode = head;
            while(currentNode.getNext()!=tail){
                currentNode = currentNode.getNext();
            }
            tail = currentNode;
            tail.setNext(null);
            size--;
            return;
        }
    }

    public void removeFirst() {

        if (head == null)
            return;
        else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            size--;
        }
    }

    public void removeLast() {
        if (tail == null)
            return;
        else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node<T> previousToTail = head;
                while (previousToTail.next != tail)
                    previousToTail = previousToTail.next;
                tail = previousToTail;
                tail.next = null;

            }
            size--;
        }

    }

    public void removeNext(Node<T> previous) {
        if (previous == null)
            removeFirst();
        else if (previous.next == tail) {
            tail = previous;
            tail.next = null;
        } else if (previous == tail)
            return;
        else {
            previous.next = previous.next.next;
        }
    }

}

