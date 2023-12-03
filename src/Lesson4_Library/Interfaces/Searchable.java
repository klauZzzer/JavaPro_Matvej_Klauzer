package Lesson4_Library.Interfaces;

import Lesson4_Library.Classes.LibraryItem;
import Lesson4_Library.Enums.Genre;

import java.util.List;

public interface Searchable {
    List<LibraryItem> findByTitle(String title);

    List<LibraryItem> findByAuthor(String author);

    List<LibraryItem> findByGenre(Genre genre);
}
