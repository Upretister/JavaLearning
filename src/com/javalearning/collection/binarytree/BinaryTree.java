package com.javalearning.collection.binarytree;

public class BinaryTree<E extends Comparable<E>> {

    private Node root;
    private int size;


    public BinaryTree(){
        this.root = null;
    }

    public int size(){
        return size;
    }

    public void add(E item){
        Node node = new Node(item);
        //If this is the first item in the tree it is added to the root
        if(root==null){
            this.root = node;
            size++;
        }
        //Otherwise we need to add element using the binary tree insert method
        else{
            insert(this.root,node);
        }
    }

    private void insert(Node parent,Node child){
        //If child is smaller than parent it goes to the left
        if(child.getItem().compareTo(parent.getItem())<0){
            //If left node is null we have found our spot
            if(parent.getLeft()==null){
                parent.setLeft(child);
                child.setParent(parent);
                size++;
            }
            //Otherwise we need to call insert again and test for the left or right(recursively)
            else{
                insert(parent.getLeft(),child);
            }
        }
        //If child is greater than the parent it goes to the right
        else if(child.getItem().compareTo(parent.getItem())>0){
            //If the node is null, we found our spot
            if(parent.getRight()==null){
                parent.setRight(child);
                child.setParent(parent);
                size++;
            }
            //Otherwise we need to call insert again and test for the left or right(recursively)
            else{
                insert(parent.getRight(),child);
            }
        }
        //If parent anc child happens to be equal currently we do nothing
        //Data in binary tree is assumed to ne unique and value already exists in the tree
    }

    public boolean contains(E item){
        Node currentNode = this.getItem(item);
        if(currentNode == null){
            //Did not find it
            return false;
        }else{
            return  true;
        }
    }
    private Node getItem(E item){
        Node currentNode = this.root;
        while(currentNode!=null){
            int val = item.compareTo(currentNode.getItem());
            //If node is a match
            if(val==0){
                return  currentNode;
            }
            //If val is less than 0, we go left side of the node
            else if(val<0){
                currentNode = currentNode.getLeft();
            }
            //If val is greater than 0, we go right side of the node
            else if(val>0){
                currentNode = currentNode.getRight();
            }
        }
        return currentNode;
    }

    public boolean delete(E item){
        boolean deleted = false;
        //Make sure root is not null means it is not empty
        if(this.root==null){
            return false;
        }
        //Find the node to be deleted
        Node currentNode = this.getItem(item);

        if(currentNode!=null){
            //If the currentNode does not have any children
            if(currentNode.getLeft()==null && currentNode.getRight()==null){
                unlink(currentNode,null);
                deleted = true;
            }
            //If node to be deleted does not have left child, remove it in heirarchy
            else if(currentNode.getLeft()==null && currentNode.getRight()!=null){
                unlink(currentNode,currentNode.getRight());
                deleted = true;
            }
            //If node to be deleted does not have a right child, remove it in hierarchy
            else if(currentNode.getLeft()!=null && currentNode.getRight()==null){
                unlink(currentNode,currentNode.getLeft());
                deleted = true;
            }
            //Node had both childrens, do a node swap to delete
            else{
            //Swap out the node with the rightmost leaf node on the left side
                Node child =  currentNode.getLeft();
                while(child.getRight()!=null && child.getLeft()!=null){
                    child = child.getRight();
                }
                //We have the right most leaf node. We can replace the current node with this node
                child.getParent().setRight(null);//Remove the leaf node from its current position
                child.setLeft(currentNode.getLeft());
                child.setRight(currentNode.getRight());
                unlink(currentNode,child);
                deleted = true;
            }
        }
        if(deleted){
            this.size--;
        }
        return deleted;
    }

    private void unlink(Node currentNode, Node newNode){
        //If it is a root node it is deleted little differently
        if(currentNode == this.root){
            newNode.setLeft(currentNode.getLeft());
            newNode.setRight(currentNode.getRight());
            this.root = newNode;
        }else if(currentNode.getParent().getRight()==currentNode){
            currentNode.getParent().setRight(newNode);
        }else{
            currentNode.getParent().setLeft(newNode);
        }
    }

  private class Node{

        private Node left;
        private Node right;
        private Node parent;
        private E item;

        public Node(E item){
            this.left = null;
            this.right = null;
            this.parent = null;
            this.item = item;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }


    }
}
