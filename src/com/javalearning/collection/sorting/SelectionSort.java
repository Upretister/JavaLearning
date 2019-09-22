package com.javalearning.collection.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]){
        int arr[] = {64,25,12,22,11,44,74};
        for(int i =0 ;i<arr.length-1;i++){
            System.out.println("Looping i: "+i);
            int max_idx = i;
            for (int j = i+1;j<arr.length;j++){
                System.out.println("Looping j: "+j);
                if (arr[j] < arr[max_idx]) {
                   max_idx = j;
                    System.out.println("Condition J: "+j);
                }

            }
            System.out.println("Checking: "+arr[max_idx]);
            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
