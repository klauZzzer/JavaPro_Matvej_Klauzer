package Lesson4_Library_29_11.Classes;

import Lesson4_Library_29_11.Enums.Genre;
import Lesson4_Library_29_11.Interfaces.Searchable;

import java.util.List;

public class Librarian implements Searchable {
    private String name;
    private String employeeId;
    private List<LibraryItem> managedItems;


    public Librarian(String name, String employeeId, List<LibraryItem> managedItems) {
        this.name = name;
        this.employeeId = employeeId;
        this.managedItems = managedItems;
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
