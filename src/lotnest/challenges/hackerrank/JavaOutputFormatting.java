package lotnest.challenges.hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            StringBuilder stringBuilder = new StringBuilder(s1);
            for (int j = 0; j < 15 - s1.length(); j++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(x);
            int intLength = String.valueOf(x).length();
            if (intLength < 3) {
                for (int j = 0; j < 3 - intLength; j++) {
                    stringBuilder.insert(15, 0);
                }
            }
            System.out.println(stringBuilder.toString());
        }
        System.out.println("================================");
    }
}
