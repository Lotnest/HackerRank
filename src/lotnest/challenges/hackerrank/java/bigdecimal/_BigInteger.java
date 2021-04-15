package lotnest.challenges.hackerrank.java.bigdecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class _BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInteger1 = new BigInteger(scanner.next());
        BigInteger bigInteger2 = new BigInteger(scanner.next());
        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
    }
}
