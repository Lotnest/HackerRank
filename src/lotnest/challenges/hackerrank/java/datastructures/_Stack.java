package lotnest.challenges.hackerrank.java.datastructures;

import java.util.Scanner;

public class _Stack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            while(input.length() != (input = input.replaceAll("\\(\\)|\\[]|\\{}", "")).length());
            System.out.println(input.isEmpty());
        }
    }
}
