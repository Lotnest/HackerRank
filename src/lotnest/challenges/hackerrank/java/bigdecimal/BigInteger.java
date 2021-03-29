package lotnest.challenges.hackerrank.java.bigdecimal;

import java.util.Scanner;

public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        java.math.BigInteger bigInteger1 = new java.math.BigInteger(scanner.next());
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(scanner.next());
        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
    }
}
