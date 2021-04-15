package lotnest.challenges.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            while (l-- > 0) {
                a.add(scanner.nextInt());
            }
            arrayList.add(a);
        }

        int m = scanner.nextInt();
        while (m-- > 0) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            if (a >= arrayList.size() || b >= arrayList.get(a).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arrayList.get(a).get(b));
            }
        }
    }
}
