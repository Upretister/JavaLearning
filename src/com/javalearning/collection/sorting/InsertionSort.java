package com.javalearning.collection.sorting;

import java.util.Arrays;

public class InsertionSort {

        /*Function to sort array using insertion sort*/
        public static void sort(int arr[])
        {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                System.out.println("Key:: "+key);
                int j = i - 1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    System.out.println("Inside Loop J Before: "+j);
                    j = j - 1;
                    System.out.println("Inside Loop J After: "+j);
                }
                arr[j + 1] = key;
                System.out.println("Outside Loop i:: "+i);
            }
        }

        public static void main(String args[]){
            int arr[] = {64,25,12,22,11,44,74};
            sort(arr);
            int i=0;
            while(i<arr.length){
                System.out.println(arr[i]);
             i++;
            }
    }
}
