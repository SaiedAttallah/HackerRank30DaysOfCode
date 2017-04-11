package Tutorials30DayOfCode;

import java.util.Scanner;

/**
 * Created by sattallah on 4/10/2017.
 */
public class Day3IntroToConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        } else if (n%2==0  && 1<n && n<6) {
            ans = "Not Weird";
        } else if (n%2==0  && 5<n && n<21) {
            ans = "Weird";
        } else{
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
