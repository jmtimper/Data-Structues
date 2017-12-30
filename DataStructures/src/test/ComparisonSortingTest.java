package test;

import main.ComparisonSorting;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonSortingTest {

    @Test
    public void testBubbleSort(){
        int[] list = {2,4,5,1,6,3,12,32,53,21,34,23,69};
        ComparisonSorting test = new ComparisonSorting();
        assertEquals("[1, 2, 3, 4, 5, 6, 12, 21, 23, 32, 34, 53, 69]", Arrays.toString(test.bubbleSort(list)));
    }

    @Test
    public void testSelectionSort(){
        int[] list = {2,4,5,1,6,3,12,32,53,21,34,23,69};
        ComparisonSorting test = new ComparisonSorting();
        assertEquals("[1, 2, 3, 4, 5, 6, 12, 21, 23, 32, 34, 53, 69]", Arrays.toString(test.selectionSort(list)));
    }

    @Test
    public void testInsertionSort(){
        int[] list = {2,4,5,1,6,3,12,32,53,21,34,23,69};
        ComparisonSorting test = new ComparisonSorting();
        assertEquals("[1, 2, 3, 4, 5, 6, 12, 21, 23, 32, 34, 53, 69]", Arrays.toString(test.insertionSort(list)));
    }

    @Test
    public void testMergeSort(){
        int[] list = {2,4,5,1,6,3,12,32,53,21,34,23,69};
        ComparisonSorting test = new ComparisonSorting();
        assertEquals("[1, 2, 3, 4, 5, 6, 12, 21, 23, 32, 34, 53, 69]", Arrays.toString(test.mergeSort(list)));
    }
}
