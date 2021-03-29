package lotnest.challenges.hackerrank;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(S.substring(start, end));
    }
}
