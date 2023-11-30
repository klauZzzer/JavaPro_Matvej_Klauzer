package Homework_20_11.Part1;

import java.util.Arrays;

public class Librarian {
    private String name;
    private int experience;
    private static String[] bookList = {"Dune", "Hobbit",
            "Sherlock Holmes", "Peter Pan", "Matilda", "The Witcher"};

    public Librarian(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public static String[] getBookList() {
        return bookList;
    }

    public void giveBook(String book) {
        String[] userBooks = new String[bookList.length-1];
        int temp = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (!bookList[i].equals(book)) {
                userBooks[temp] = bookList[i];
                temp++;
            }
        }
        bookList = userBooks;
        System.out.println(this.name + ", работающий " + this.experience + " лет");
        System.out.println("Выдал книгу - " + book);
        System.out.println("Список доступных книг - " + Arrays.toString(bookList));
    }

    public void takeBook(String book) {
        String[] userBooks = new String[bookList.length+1];
        for (int i = 0; i < userBooks.length; i++) {
            if (i < bookList.length) {
                userBooks[i] = bookList[i];
            } else {
                userBooks[i] = book;
                bookList = userBooks;
            }
        }
        System.out.println(this.name + ", работающий " + this.experience + " лет");
        System.out.println("Взял книгу - " + book);
        System.out.println("Список доступных книг - " + Arrays.toString(bookList));
    }
}
