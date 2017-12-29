package main;

/**
 * Stack Data Structure
 */
public class Stack {
    //holds data
    int[] stack;
    //number of elements in stack
    int size = 0;
    //total capacity of stack
    int cap = 0;

    /**
     * constructor with default capacity of 5
     */
    public Stack(){
        cap = 5;
        stack = new int[cap];
    }

    /**
     * constructor with param
     * @param capacity size of stack
     */
    public Stack(int capacity){
        stack = new int[capacity];
        cap = capacity;
    }

    /**
     * checks whether the stack is empty or not
     * @return true if stack is empty
     */
    public boolean isEmpty(){
        if(size == 0) return true;
        return false;
    }

    /**
     * peeks at element at top of the stack
     * @return element at top of stack
     */
    public int peek(){
        return stack[size-1];
    }

    /**
     * pushs element to stack
     * @param data data being pushed
     */
    public void push(int data){
        if(size >= cap) resize();
        stack[size] = data;
        size++;
    }

    /**
     * pops top element off stack
     * @return top element
     */
    public int pop(){
        return stack[--size];
    }

    /**
     * resizes stack if size reaches capacity
     */
    private void resize(){
        cap *= 2;
        int[] temp = new int[cap];
        System.arraycopy(stack, 0, temp, 0, stack.length);
        stack = temp;
    }
}
