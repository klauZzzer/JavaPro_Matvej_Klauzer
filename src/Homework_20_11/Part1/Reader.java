package Homework_20_11.Part1;

import java.util.Arrays;

public class Reader {
    private String name;
    private int age;
    private String[] bookList;

    public Reader(String name, int age, String[] bookList) {
        this.name = name;
        this.age = age;
        this.bookList = bookList;
    }

    public void takeBook(String book) {
        String[] userBooks = new String[this.bookList.length+1];
        for (int i = 0; i < userBooks.length; i++) {
            if (i < this.bookList.length) {
                userBooks[i] = this.bookList[i];
            } else {
                userBooks[i] = book;
                this.bookList = userBooks;
            }
        }
        System.out.println(this.name + ", " + this.age);
        System.out.println("Взял книгу - " + book);
        System.out.println("Список взятых книг - " + Arrays.toString(this.bookList));
    }

    public void returnBook(String book) {
        String[] userBooks = new String[this.bookList.length-1];
        int temp = 0;
        for (int i = 0; i < this.bookList.length; i++) {
            if (!this.bookList[i].equals(book)) {
                userBooks[temp] = this.bookList[i];
                temp++;
            }
        }
        this.bookList = userBooks;
        System.out.println(this.name + ", " + this.age);
        System.out.println("Вернул книгу - " + book);
        System.out.println("Список взятых книг - " + Arrays.toString(this.bookList));
    }
}
