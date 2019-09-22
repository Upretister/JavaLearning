package practice;

import java.util.Scanner;

public class PyramidJava {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String dataStr = sc.nextLine();
        System.out.println("Enter no of test cases:");
        int testCase = sc.nextInt();
        System.out.println("Enter no of rows:");
        int noOfRows = sc.nextInt();
        System.out.println("Enter the orientation:");
        int token = sc.nextInt();

        if(token>0){
            for(int i=noOfRows;i>0;i--){
                for(int j=0;j<i-1;j++){
                    System.out.print("*");
                }
                for(int k=i;k==i;k--){
                    System.out.print(k);
                }
                System.out.println();
                //System.out.println("i: "+i);
            }
        }else{

        }
        sc.close();
    }
}
