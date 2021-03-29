package lotnest.challenges.hackerrank.java.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        // Write your code here.
        String[] parts = string.split("[!,?._'@ ]");
        parts = Arrays.stream(parts).filter(str -> !str.isEmpty()).toArray(String[]::new);
        System.out.println(parts.length);
        for (String part : parts) {
            System.out.println(part);
        }
        scanner.close();
    }
}
