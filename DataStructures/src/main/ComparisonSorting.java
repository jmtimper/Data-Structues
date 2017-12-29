package main;

/**
 * Comparison sorting implementation
 */
public class ComparisonSorting {

    /**
     * Sorts list using bubble sort algorithm
     * @param list unsorted list
     * @return sorted list
     */
    public int[] bubbleSort(int [] list){
        boolean isChanged = true;
        while(isChanged) {
            isChanged = false;
            for (int i = 0; i < list.length-1; i++) {
                if(list[i] > list[i+1]){
                    isChanged = true;
                    int num = list[i];
                    list[i] = list[i+1];
                    list[i+1] = num;
                }
            }
        }
        return list;
    }

    /**
     * Sorts list using selection sort algorithm
     * @param list unsorted list
     * @return sorted list
     */
    public int[] selectionSort(int[] list){
        for(int i = 0; i < list.length; i++){
            int min = Integer.MAX_VALUE;
            int pos = 0;
            for(int k = i; k < list.length; k++){
                if(list[k] < min){
                    min = list[k];
                    pos = k;
                }
            }
            int num = list[pos];
            list[pos] = list[i];
            list[i] = num;
        }
        return list;
    }

    /**
     * Sorts list using insertion sort algorithm
     * @param list unsorted list
     * @return sorted list
     */
    public int[] insertionSort(int[] list){
        for(int i = 0; i < list.length; i++){
            int num = list[i];
            int pos = i;
            while(pos > 0 && list[pos] < list[pos-1]){
                list[pos] = list[pos-1];
                list[pos-1] = num;
                pos--;
            }
        }
        return list;
    }
}
