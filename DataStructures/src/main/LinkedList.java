package main;

public class LinkedList {

    //head node
    LinkedListNode head;
    //size of list
    private int size;

    public LinkedList(){
        head = new LinkedListNode("LinkedList:");
        head.next = null;
        size = 0;
    }

    /**
     * adds node at end of list
     * @param val data to be added
     * @return head of linked list
     */
    public LinkedListNode addLast(Object val){
        LinkedListNode iter = head;
        while(iter.next != null){
            iter = iter.next;
        }
        iter.next = new LinkedListNode(val);
        size++;
        return head;
    }

    /**
     * adds node at position with value
     * @param val data to be added to list
     * @param pos position to be added in
     * @return head of the list
     */
    public LinkedListNode addAt(Object val, int pos){
        LinkedListNode temp = new LinkedListNode(val);
        LinkedListNode iter = head;
        for(int i = 0; i < pos && iter.next != null; i++){
            iter = iter.next;
        }
        if(iter.next == null){
            iter.next = temp;
        } else {
            temp.next = iter.next;
            iter.next = temp;
        }
        size++;
        return head;
    }

    /**
     * Deletes object from linked list
     * @param val data to be deleted
     * @return head of linked list
     */
    public LinkedListNode delete(Object val){
        LinkedListNode iter = head;
        while(iter.next != null && iter.next.data != val){
            iter = iter.next;
        }
        if(iter.next == null){
            System.out.print("Data not in list");
        } else if(iter.next.data == val){
            iter.next = iter.next.next;
            size--;
        }
        return head;
    }

    /**
     * prints the linkedList out
     * @return string of all nodes in list
     */
    public String toString(){
        return head.next.toString();
    }

    /**
     * returns size of list
     * @return size of linked list
     */
    public int size(){
        return size;
    }

}
