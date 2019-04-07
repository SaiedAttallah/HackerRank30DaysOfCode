package Day1to10;

import java.util.Scanner;

public class Day10BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int counter = 0, max = 0;

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        while (n > 0) {
            counter = ++counter * (n%2);
            max = Math.max(counter, max);
            n/=2;
        }

        System.out.println(max);

        scanner.close();
    }
}
