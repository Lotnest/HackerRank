package lotnest.challenges.hackerrank.java.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Iterator {

    static java.util.Iterator func(ArrayList list) {
        java.util.Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (element instanceof String) {
                break;
            }
        }
        return iterator;
    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        java.util.Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}