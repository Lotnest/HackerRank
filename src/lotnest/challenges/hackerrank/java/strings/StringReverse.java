package lotnest.challenges.hackerrank.java.strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        /* Enter your code here. Print output to STDOUT. */
        if (new StringBuilder(A).reverse().toString().equalsIgnoreCase(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
