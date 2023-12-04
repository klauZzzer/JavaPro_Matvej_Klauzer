package Lesson4_Library_29_11.Classes;

import Lesson4_Library_29_11.Enums.Genre;
import Lesson4_Library_29_11.Enums.ItemCondition;

abstract public class LibraryItem {
    private String title;
    private String author;
    private Genre genre;
    private ItemCondition itemCondition;

    public LibraryItem(String title, String author, Genre genre, ItemCondition itemCondition) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.itemCondition = itemCondition;

    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", itemCondition=" + itemCondition +
                '}';
    }

    public ItemCondition getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(ItemCondition itemCondition) {
        this.itemCondition = itemCondition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
