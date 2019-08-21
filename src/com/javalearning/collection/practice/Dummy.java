package com.javalearning.collection.practice;
import java.util.Scanner;
import java.util.Arrays;
public class Dummy {
//Case11: xyzw, xyxy
    //Case 16: bbcc,dabc

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean flag=false;
        //System.out.println("string1: "+a.hashCode()+" Str2: "+b.hashCode());
        char[] x1= sortedData(a.toLowerCase().toCharArray());
        char[] x2= sortedData(b.toLowerCase().toCharArray());
//         char[] x1=a.toLowerCase().toCharArray();
//         char[] x2=b.toLchar[] x1=owerCase().toCharArray();
//
//         if(x1.length==x2.length){
//             flag = comp(x1,x2);
//         }
         return flag;
    }

    static boolean comp(char[] x1, char[] x2){
        Arrays.sort(x1);
        Arrays.sort(x2);
        boolean flag = true;
        for (int i=0;i<x1.length;i++){
            if(x1[i]!=x2[i]){
                flag = false;
            }
        }
        return flag;
    }

    static char[] sortedData(char[] x) {
        int []x1=new int[x.length];
        for(int j=0;j<x.length;j++){
            x1[j] = (int)x[j];
            System.out.println(x1[j]);
        }
        int i=1;
        while(i<x.length-1){
            int temp=0;
            for(int j=0;j<x.length;j++){
                if(x1[i]<x1[j]){
                   temp= x1[j];
                   x1[j]=x[j+1];
                }
            }
        }
        char []ch=new char[x.length];
        return ch;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



