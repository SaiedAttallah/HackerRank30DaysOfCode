package Day1to10;

import java.util.Scanner;

/**
 * Created by sattallah on 4/26/2017.
 */
public class Day5Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i<11; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
