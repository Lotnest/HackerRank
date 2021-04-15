package lotnest.challenges.hackerrank.java.datastructures;

import java.util.*;

public class _Dequeue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            deque.add(input);
            hashSet.add(input);

            if (deque.size() == m) {
                if (hashSet.size() > max) {
                    max = hashSet.size();
                }
                int first = deque.remove();
                if (!deque.contains(first)) {
                    hashSet.remove(first);
                }
            }
        }
        System.out.println(max);
    }
}
