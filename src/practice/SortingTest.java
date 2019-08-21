package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingTest {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int noOfInputs = sc.nextInt();

        Map<Integer, Integer> elements = new HashMap<>(noOfInputs);
        int totalRepCount = 0;
        for(int inputCount = 0; inputCount < noOfInputs; inputCount++){
            int input = sc.nextInt();

            if(elements.containsKey(input)){
                Integer count = elements.get(input);
                count = count + 1;
                elements.put(input, count);
                if(count == 2) {
                    totalRepCount++;
                }
            } else {
                elements.put(input, 1);
            }
        }
        System.out.print(totalRepCount);
    }
}
