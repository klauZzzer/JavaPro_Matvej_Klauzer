package Homework_20_11.Part1;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void infoAboutBook() {
        System.out.println("Название книги - " + this.name);
        System.out.println("Имя автора - " + this.author);
        System.out.println("Год выхода - " + this.year);
    }

    public void isBookOld() {
        if (2023 - year > 50) {
            System.out.println("Это старинная книга");
        } else {
            System.out.println("Это еще не старинная книга");
        }
    }
}
