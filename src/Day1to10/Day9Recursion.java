package Day1to10;

import java.util.Scanner;

/**
 * Created by sattallah on 4/11/2017.
 */
public class Day9Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factorial(n));
    }

    private static int factorial(int n){
        // Recursive Case
        if(n > 1) {
            return n * factorial(n - 1);
        }
        // Base Case n = 1
        else {
            return n;
        }
    }
}
