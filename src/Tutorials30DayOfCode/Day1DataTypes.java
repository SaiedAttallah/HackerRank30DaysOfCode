package Tutorials30DayOfCode;

import java.util.Scanner;

/**
 * Created by sattallah on 3/27/2017.
 */
public class Day1DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int ini = scan.nextInt();
        double ind = scan.nextDouble();
        scan.nextLine();
        String ins = scan.nextLine();

        System.out.println(i+ini);
        System.out.println(d+ind);
        System.out.println(s+ins);
    }
}
