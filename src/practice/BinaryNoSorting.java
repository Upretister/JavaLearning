package practice;

public class BinaryNoSorting {

    public static void main(String args[]){
        int arr[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1,1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };
        int j = -1;
        for (int i = 0; i < arr.length; i++) {

            // if number is smaller than 1 
            // then swap it with j-th number 
            if (arr[i] < 1) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }
}
