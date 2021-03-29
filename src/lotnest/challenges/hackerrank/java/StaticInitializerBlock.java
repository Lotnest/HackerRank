package lotnest.challenges.hackerrank.java;

import java.util.Scanner;

public class StaticInitializerBlock {

    private static final int B;
    private static final int H;
    private static boolean flag = false;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        flag = B > 0 && H > 0;
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
