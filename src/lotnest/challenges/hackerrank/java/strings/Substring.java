package lotnest.challenges.hackerrank.java.strings;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(S.substring(start, end));
    }
}
