package Lesson4_Library.Classes;

import Lesson4_Library.Enums.Genre;
import Lesson4_Library.Interfaces.Searchable;

import java.util.List;

public class User implements Searchable {
    private String name;
    private String id;
    private List<LibraryItem> borrowedItems;

    public User(String name, String id, List<LibraryItem> borrowedItems) {
        this.name = name;
        this.id = id;
        this.borrowedItems = borrowedItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    @Override
    public List<LibraryItem> findByTitle(String title) {
        return null;
    }

    @Override
    public List<LibraryItem> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<LibraryItem> findByGenre(Genre genre) {
        return null;
    }
}
