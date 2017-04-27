package Tutorials30DayOfCode;

import java.util.Scanner;

/**
 * Created by sattallah on 4/26/2017.
 */
public class Day6LetsReview {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i=1; i<= T; i++) {
            String str = scan.nextLine();
            printEvenSpaceOdd(str.toCharArray());
        }
    }

    private static void printEvenSpaceOdd(char[] myCharArray) {
        int len = myCharArray.length;
        for (int i = 0; i < len; i += 2) {
            System.out.print(myCharArray[i]);
        }
        System.out.print(" ");
        for (int i = 1; i < len; i += 2) {
            System.out.print(myCharArray[i]);
        }
        System.out.println();
    }
}
