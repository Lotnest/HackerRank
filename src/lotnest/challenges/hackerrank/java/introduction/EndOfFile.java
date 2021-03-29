package lotnest.challenges.hackerrank.java.introduction;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNextLine()) {
            System.out.println(++i + " " + scanner.nextLine());
        }
    }
}
