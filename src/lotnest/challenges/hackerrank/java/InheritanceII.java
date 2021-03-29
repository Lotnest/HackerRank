package lotnest.challenges.hackerrank.java;

public class InheritanceII {

    //Write your code here
    static class Arithmetic {

        int add(int x, int y) {
            return x + y;
        }
    }

    static class Adder extends Arithmetic {
    }

    public static void main(String[] args) {
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}
