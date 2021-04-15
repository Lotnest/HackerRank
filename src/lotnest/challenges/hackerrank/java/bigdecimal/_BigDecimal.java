package lotnest.challenges.hackerrank.java.bigdecimal;

import java.math.BigDecimal;
import java.util.*;

public class _BigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        scanner.close();

        //Write your code here
        Arrays.sort(s, (o1, o2) -> {
            if (o1 == null || o2 == null) {
                return 0;
            }
            BigDecimal bigDecimal1 = new BigDecimal(o1);
            BigDecimal bigDecimal2 = new BigDecimal(o2);
            return bigDecimal2.compareTo(bigDecimal1);
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}