package lotnest.challenges.hackerrank.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class _BitSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet[] bitSet = new BitSet[3];
        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);
        bitSet[1] = bitSet1;
        bitSet[2] = bitSet2;

        while (m-- > 0) {
            String operation = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            switch (operation) {
                case "AND":
                    bitSet[a].and(bitSet[b]);
                    break;
                case "OR":
                    bitSet[a].or(bitSet[b]);
                    break;
                case "XOR":
                    bitSet[a].xor(bitSet[b]);
                    break;
                case "FLIP":
                    bitSet[a].flip(b);
                    break;
                case "SET":
                    bitSet[a].set(b);
            }
            System.out.printf("%d %d%n", bitSet1.cardinality(), bitSet2.cardinality());
        }
    }
}
