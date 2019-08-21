package practice;

import java.util.Arrays;
import java.util.Scanner;

public class WinLooseOpti {
    public static void main(String argsp[]){

        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        int[] villianStrength = new int[noOfTestCases];
        int[] energies = new int[noOfTestCases];
        boolean willWin = true;
        for(int testCaseNo = 0;testCaseNo < noOfTestCases; testCaseNo++) {

            int noOfVillians = sc.nextInt();
            int noOfEnergies = sc.nextInt();
            villianStrength[testCaseNo] = noOfVillians;
            energies[testCaseNo] = noOfEnergies;
        }
            Arrays.sort(villianStrength);
            Arrays.sort(energies);

            for(int matchCount = 0; matchCount < noOfTestCases; matchCount++){
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


        sc.close();
    }
}
