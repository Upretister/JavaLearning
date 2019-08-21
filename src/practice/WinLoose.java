package practice;

import java.util.Arrays;
import java.util.Scanner;

public class WinLoose {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        for(int testCaseNo = 0;testCaseNo < noOfTestCases; testCaseNo++) {
            boolean willWin = true;
            int noOfVillians = sc.nextInt();
            int[] villianStrength = new int[noOfVillians];
            int[] energies = new int[noOfVillians];

            for(int count = 0; count < noOfVillians; count++){
                villianStrength[count] = sc.nextInt();
            }

            for(int count = 0; count < noOfVillians; count++){
                energies[count] = sc.nextInt();
            }
            Arrays.sort(villianStrength);
            Arrays.sort(energies);

            for(int matchCount = 0; matchCount < noOfVillians; matchCount++){
                if(energies[matchCount] <= villianStrength[matchCount]){
                    willWin = false;
                    break;
                }
            }
            if(willWin) {
                System.out.println("WIN");
            } else{
                System.out.println("LOSE");
            }
        }

        sc.close();
    }
}
/*
2
6
10 20 50 100 500 400
30 20 60 70 90 490
5
10 20 30 40 50
40 50 60 70 80
 */