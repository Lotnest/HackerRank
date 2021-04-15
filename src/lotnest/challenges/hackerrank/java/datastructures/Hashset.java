package lotnest.challenges.hackerrank.java.datastructures;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }

        //Write your code here
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            hashSet.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(hashSet.size());
        }
    }
}
