package lotnest.challenges.hackerrank.java.datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class _Map {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            scanner.nextLine();
            phoneBook.put(name, phone);
        }

        while (scanner.hasNext()) {
            String person = scanner.nextLine();
            if (phoneBook.containsKey(person)) {
                System.out.println(person + "=" + phoneBook.get(person));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
