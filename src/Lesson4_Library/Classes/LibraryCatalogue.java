package Lesson4_Library.Classes;

import Lesson4_Library.Enums.Genre;
import Lesson4_Library.Interfaces.Searchable;

import java.util.List;

public class LibraryCatalogue implements Searchable {
    private List<Book> books;
    private List<Magazine> magazines;

    public LibraryCatalogue(List<Book> books, List<Magazine> magazines) {
        this.books = books;
        this.magazines = magazines;
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
