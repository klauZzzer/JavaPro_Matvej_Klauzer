package Lesson4_Library_29_11.Interfaces;

import Lesson4_Library_29_11.Classes.LibraryItem;
import Lesson4_Library_29_11.Enums.Genre;

import java.util.List;

public interface Searchable {
    List<LibraryItem> findByTitle(String title);

    List<LibraryItem> findByAuthor(String author);

    List<LibraryItem> findByGenre(Genre genre);
}
