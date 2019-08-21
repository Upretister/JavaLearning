package com.javalearning.collection.linkedlist.pluralisght;


    public class LinkedList<E> {

        private Node first;
        private Node last;
        private int nodeCount;
        public LinkedList(){
            this.first = null;
            this.last = null;
            this.nodeCount = 0;
        }

        public int size(){
            return nodeCount;
        }

        //For Adding an element to linked list
        public void add(E item){
            //Adding a field for the first time in the Linked List
            if(first==null){
                first = new Node(item);
                last = first;
            }else{
                Node newLastNode = new Node(item);
                last.setNextNode(newLastNode);
                last = newLastNode;
            }
            nodeCount++;
        }

        //For removing the element for the Linked List
        public E remove(){
            if(first==null){
                throw new IllegalStateException("Linked List is empty");
            }

            E nodeItem = first.getNodeItem();
            //Updating the node pointer and removing the first element
            first = first.getNextNode();
            nodeCount--;
            return nodeItem;
        }

        public void insert(E item,int position){

            if(size()<position){
                throw new IllegalStateException("This position does not exist or linked list size is smaller than the position");
            }

            Node currentNode = first;
            //Starting from 1 as we are on the first node
            for(int i=0;i<position && currentNode!=null;i++){
                currentNode = currentNode.getNextNode();
            }
            //Severs the link chain and reconnects with the new node
            Node newNode = new Node(item);
            Node nextNode = currentNode.getNextNode();
            currentNode.setNextNode(newNode);
            newNode.setNextNode(nextNode);
            nodeCount++;
        }

        public E removeAt(int position){
            if(first==null){
                throw new IllegalStateException("Linked List in empty");
            }
            Node currentNode = first;
            Node previousNode = first;
            //Starting at 1 as we are already on the first Node
            for (int i = 0;i<position && currentNode!=null;i++){
                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
            }
            E nodeItem = currentNode.getNodeItem();
            previousNode.setNextNode(currentNode.getNextNode());
            nodeCount--;
            return nodeItem;
        }

        public E get(int position){
            if(first==null){
                throw new IllegalStateException("Linked List in empty");
            }

            Node currentNode = first;
            for(int i=0;i<size()&&currentNode!=null;i++){
                if(i==position){
                    return currentNode.getNodeItem();
                }
                currentNode = currentNode.getNextNode();
            }
            //If we find nothing at that position
            return null;
        }

        public int find(E item){
            if(first==null){
                throw new IllegalStateException("Linked List in empty");
            }

            Node currentNode = first;
            for(int i=0;i<size()&&currentNode!=null;i++){
                if(currentNode.getNodeItem().equals(item)){
                    return i;
                }
                currentNode = currentNode.getNextNode();
            }
            //if we did'nt find it, then returning -1
            return -1;
        }

        //Useful for printing
        public String toString(){
            StringBuffer sb = new StringBuffer();
            Node currentNode = first;
            while(currentNode!=null){
                sb.append(currentNode.getNodeItem());
                currentNode = currentNode.getNextNode();
                if(currentNode!=null){
                    sb.append(", ");
                }
            }
            return sb.toString();
        }

        private class Node{

            private Node nextNode;
            private E nodeItem;

            public Node(E item){
                this.nextNode = null;
                this.nodeItem = item;
            }

            public Node getNextNode() {
                return nextNode;
            }

            public void setNextNode(Node nextNode) {
                this.nextNode = nextNode;
            }

            public E getNodeItem() {
                return nodeItem;
            }

            public void setNodeItem(E nodeItem) {
                this.nodeItem = nodeItem;
            }
        }
    }


