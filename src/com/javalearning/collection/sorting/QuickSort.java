package com.javalearning.collection.sorting;

public class QuickSort {
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        System.out.println("Value i: "+i);
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;
                // swap arr[i] and arr[j]
               // System.out.println("V: "+arr[i]+" J: "+arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println("After SWAP V: "+arr[i]+" J: "+arr[j]);
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        System.out.println("Before Outside SWAP V: "+i);
        System.out.println("Before SWAP OUT V: "+arr[i+1]+" J: "+arr[high]);

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        System.out.println("After SWAP OUT V: "+arr[i+1]+" J: "+arr[high]);

        return i+1;
    }
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    public static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);
            System.out.println("VALUE OF PI:: "+pi);
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    public static void main(String args[]){
        int arr[] = {64,25,12,22,11,44,74};
       // int arr[] = {1,1,0,1,0,0,1};
        System.out.println("Length: "+arr.length);
        sort(arr,0,arr.length-1);
        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }
}
