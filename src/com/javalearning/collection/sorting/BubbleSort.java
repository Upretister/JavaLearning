package com.javalearning.collection.sorting;

public class BubbleSort {

    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr [j];
                    arr[j] = temp;
                }
            }
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
