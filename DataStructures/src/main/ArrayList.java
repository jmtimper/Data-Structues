package main;

/**
 * creates an arraylist data structure
 * @Author Jeremy Timperio
 */
public class ArrayList {

    //array to hold array list values
    private Object[] arr;
    //number of objects in array
    private int len;
    //the capacity in arr
    private int capacity;

    /**
     * initial constructor
     */
    public ArrayList(){
        len = 0;
        capacity = 5;
        arr = new Object[capacity];
    }

    /**
     * doubles the size of capacity and the array
     */
    private void moreSpace(){
        capacity *= 2;
        Object[] temp = new Object[capacity];
        System.arraycopy(arr, 0, temp, 0, len);
        arr = temp;
    }

    /**
     * public void add(E obj){
     * @param obj object to be added
     */
    public void add(Object obj){
        arr[len] = obj;
        len++;
        if(len == capacity) moreSpace();
    }

    /**
     * returns object at position
     * @param pos position to get
     * @return object at position
     */
    public Object getAt(int pos){
        return arr[pos];
    }

    /**
     * removes object from list
     * @param obj object to be removed
     * @return returns removed object, returns null if no in list
     */
    public Object remove(Object obj){
        for(int i = 0; i < len; i++){
            if(obj == arr[i]){
                Object temp = arr[i];
                len--;
                for(int k = i; k < len; k++){
                    arr[k] = arr[k+1];
                }
                arr[len] = null;
                return temp;
            }
        }
        return null;
    }

    /**
     * returns number of elements in the arraylist
     * @return size
     */
    public int size(){
        return len;
    }

    /**
     * returns array of the arraylist
     * @return array of arraylist
     */
    public Object[] toArray(){
        Object[] temp = new Object[len];
        System.arraycopy(arr, 0, temp, 0, len);
        return temp;
    }

    /**
     * trims capacity of array to size
     */
    public void trim(){
        Object[] temp = new Object[len];
        System.arraycopy(arr, 0, temp, 0,len);
        arr = temp;
    }

    /**
     * checks for if object is in arrayList
     * @param obj Object being checked
     * @return true if exists in arrayList
     */
    public boolean contains(Object obj){
        for(int i = 0; i < len; i++){
            if(obj == arr[i]) return true;
        }
        return false;
    }
}
