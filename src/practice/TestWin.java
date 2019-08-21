package practice;

import java.util.Arrays;
import java.util.Scanner;

public class TestWin {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        int villSum=0;
        int energySum=0;
        for(int testCaseNo = 0;testCaseNo < noOfTestCases; testCaseNo++) {

            int noOfVillians = sc.nextInt();
            int[] villianStrength = new int[noOfVillians];
            int[] energies = new int[noOfVillians];

            for(int count = 0; count < noOfVillians; count++){
                villianStrength[count] = sc.nextInt();
                villSum = villSum+villianStrength[count];
            }

            for(int count = 0; count < noOfVillians; count++){
                energies[count] = sc.nextInt();
                energySum = energySum+energies[count] ;
            }

            if(energySum>=villSum) {
                System.out.println("WIN");
            } else{
                System.out.println("LOSE");
            }
        }

        sc.close();
    }
}

