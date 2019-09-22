package practice;

public class StringReversal {


    public static void main(String args[]){
        int pyramidHeight = 5;
        int maxStringLength = 5*(2 + (pyramidHeight -1) *2);
        maxStringLength = maxStringLength/2;
        System.out.println(maxStringLength);
        String str = "MANISH";
        String reverse = "";
        for(int i = str. length() - 1; i >= 0; i--)
        {
            reverse = reverse + str. charAt(i);
        }

        System.out.println(reverse);

    }
}
