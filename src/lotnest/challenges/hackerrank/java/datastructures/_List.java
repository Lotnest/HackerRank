package lotnest.challenges.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            String query = scanner.next();
            int index = scanner.nextInt();
            if (query.equals("Insert")) {
                int value = scanner.nextInt();
                list.add(index, value);
            } else {
                list.remove(index);
            }
        }
        list.forEach(a -> System.out.print(a + " "));
        scanner.close();
    }
}
