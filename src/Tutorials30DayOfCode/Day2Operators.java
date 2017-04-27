package Tutorials30DayOfCode;

import java.util.Scanner;

/**
 * Created by SaiedAttallah on 3/31/2017.
 */
public class Day2Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tipValue = 0, taxValue = 0;
        if (tipPercent != 0) {
            tipValue = mealCost * tipPercent / 100;
        }
        if (taxPercent != 0) {
            taxValue = mealCost * taxPercent / 100;
        }
        double sum = mealCost + tipValue + taxValue;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(sum);

        System.out.print("The total meal cost is " + totalCost + " dollars");
    }
}
