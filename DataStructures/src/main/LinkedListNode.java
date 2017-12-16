package main;

import sun.awt.image.ImageWatched;

/**
 * Node in a LinkedList
 * @Author Jeremy Timperio
 */
public class LinkedListNode {

    //object for node data
    Object data;
    //points to next node
    LinkedListNode next;

    /**
     * contructor with 1 param
     * @param val object data
     */
    public LinkedListNode(Object val) {
        data = val;
        next = null;
    }

    /**
     * contructor with 2 params
     * @param val object data
     * @param temp points to next node
     */
    public LinkedListNode(Object val, LinkedListNode temp){
        data = val;
        next = temp;
    }

    /**
     * Set next for node
     * @param node Node for the next
     */
    public void setNext(LinkedListNode node){
        next = node;
    }

    /**
     * Set data for node
     * @param val new Data for the node
     */
    public void setData(Object val){
        data = val;
    }

    /**
     * sets all node values to null
     */
    public void delete(){
        data = null;
        next = null;
    }

    /**
     * prints out LinkedList
     * @return string of data
     */
    public String toString(){
        if(next == null) return data.toString();
        return data.toString() + ", " + next.toString();
    }
}
