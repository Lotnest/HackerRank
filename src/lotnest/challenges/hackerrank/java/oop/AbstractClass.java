package lotnest.challenges.hackerrank.java.oop;

import java.util.Scanner;

public class AbstractClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        MyBook newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("The title is: " + newNovel.getTitle());
        scanner.close();
    }
}

abstract class Book {

    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

//Write MyBook class here
class MyBook extends Book {

    void setTitle(String title) {
        this.title = title;
    }
}