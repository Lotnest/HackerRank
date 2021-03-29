package lotnest.challenges.hackerrank.java.strings;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String string, int k) {
        String smallest = string.substring(0, k);
        String largest = string.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i <= string.length() - k; i++) {
            String stringTemp = string.substring(i, i + k);
            if (stringTemp.compareTo(smallest) < 0) {
                smallest = stringTemp;
            }
            if (stringTemp.compareTo(largest) > 0) {
                largest = stringTemp;
            }
        }
        return smallest + "\n" + largest;
    }
}
