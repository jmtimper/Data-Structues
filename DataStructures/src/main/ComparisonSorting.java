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

    /**
     * sorts list using merge sort algorithm
     * @param list unsorted list
     * @return sorted list
     */
    public int[] mergeSort(int[] list){

        mergeSorting(list, 0, list.length-1);
        return list;
    }

    /**
     * recursive algorithm for breaking apart array
     * @param list unsorted values
     * @param left left bound of array
     * @param right right bound of array
     */
    private void mergeSorting(int[] list, int left, int right){
        if(left < right){
            //find middle
            int mid = left+(right-left)/2;

            //separate array into halves
            mergeSorting(list, left, mid);
            mergeSorting(list, mid+1, right);

            //merge array back together
            merge(list, left, mid, right);
        }

    }

    /**
     * merges list back together
     * @param list unsorted values
     * @param left left bound of array
     * @param mid middle of array
     * @param right right bound of array
     */
    private void merge(int[] list, int left, int mid, int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;

        //temp arrays created
        int[] L = new int[n1];
        int[] R = new int[n2];

        //copy data into subarrays
        for(int i = 0; i < n1; i++)
            L[i] = list[left + i];
        for(int j = 0; j < n2; j++)
            R[j] = list[mid + 1 + j];

        //merge the temp arrays back into list
        int i = 0; // initial index of first subarray
        int j = 0; // initial index of second subarray
        int k = left; // initial index of merged subarray
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                list[k] = L[i];
                i++;
            } else {
                list[k] = R[j];
                j++;
            }
            k++;
        }

        //copy remaining elements of L[]
        while(i < n1){
            list[k] = L[i];
            i++;
            k++;
        }

        //copy remaining elements of R[]
        while(j < n2){
            list[k] = R[j];
            j++;
            k++;
        }
    }

}
