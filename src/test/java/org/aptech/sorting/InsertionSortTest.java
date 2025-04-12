package org.aptech.sorting;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {
    InsertionSort insertionSort = new InsertionSort();
    @Test
    public void arrangeTheNumbers (){
        int[] arr = {4, 5, 6, 7, 2, 8, 9, 3};
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 8, 9}, insertionSort.insertionMethod(arr));
    }
}