package practice;

import java.util.Scanner;

public class PyramidPrinting1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        //String strDelimeter = "\\s+";
        for(int i = 0;i<testCases;i++){
            String str = sc.nextLine();
            String inputs[] = str.split("\\s+");
            //System.out.println("Value: "+inputs.length+" : "+inputs[0]);
            printPyramid(inputs[0],Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
        }
    }

    public static void printPyramid(String inputString, int pyramidHeight, int orientation){
        String stringToBePrinted = stringToBePrinted(inputString, pyramidHeight);
        int rowLength =0;
        if(orientation == 1){
            rowLength = 1;
        } else {
            rowLength = 2 + (pyramidHeight -1) * 2;
            rowLength = rowLength -1;
        }
        int startIndex = 0;
        boolean toBeReversed = false;
        for(int row = 1; row <= pyramidHeight; row++){
            if(orientation == 1){
                printSpaces(pyramidHeight - row);
            } else {
                printSpaces(row -1);
            }
            String content = "";
            if(orientation == 1){
                try {
                    content = stringToBePrinted.substring(startIndex, startIndex + rowLength);
                }catch (Exception e){
                    e.printStackTrace();
                }
            } else {
                content = stringToBePrinted.substring(startIndex, startIndex + rowLength );
            }

            if(toBeReversed){
                content = reverseString(content);
            }
            startIndex = startIndex + rowLength;
            System.out.println(content);
            if(orientation == 1){
                rowLength = rowLength + 2;
            } else {
                rowLength = rowLength - 2;
            }

            toBeReversed = toggleReverse(toBeReversed);
        }
    }

    private static boolean toggleReverse(boolean toBeReversed) {
        if(toBeReversed) {
            toBeReversed = false;
        } else {
            toBeReversed = true;
        }
        return toBeReversed;
    }

    public static void printSpaces(int noOfSpaces){
        for(int count = 0; count < noOfSpaces; count++){
            System.out.print(" ");
        }

    }

    public static String stringToBePrinted(String inputString,int pyramidHeight){
        int maxStringLength = pyramidHeight*(2 + (pyramidHeight -1) *2);
        maxStringLength = (maxStringLength/2);
        String stringToBePrinted = "";
        while(stringToBePrinted.length() <= maxStringLength){
            stringToBePrinted +=  inputString;
        }
        stringToBePrinted = stringToBePrinted.substring(0,maxStringLength);
        System.out.println(" # "+stringToBePrinted.length());
        return stringToBePrinted;
    }

    public static String reverseString(String str){
        String reverse = "";
        for(int i = str. length() - 1; i >= 0; i--)
        {
            reverse = reverse + str. charAt(i);
        }
        return reverse;
    }
}