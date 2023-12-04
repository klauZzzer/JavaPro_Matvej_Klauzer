package Lesson4_Library_29_11.Classes;

import Lesson4_Library_29_11.Enums.BookStatus;
import Lesson4_Library_29_11.Enums.Genre;
import Lesson4_Library_29_11.Enums.ItemCondition;
import Lesson4_Library_29_11.Interfaces.Borrowable;
import Lesson4_Library_29_11.Interfaces.Maintainable;

import java.time.LocalDate;

public class Book extends LibraryItem implements Borrowable, Maintainable {
    private BookStatus status;
    private LocalDate publishDate;
    private int pageCount;

    public Book(String title, String author, Genre genre, ItemCondition itemCondition, BookStatus status, LocalDate publishDate, int pageCount) {
        super(title, author, genre, itemCondition);
        this.status = status;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + getTitle() +
                " author=" + getAuthor() +
                " genre=" + getGenre() +
                " ItemCondition=" + getItemCondition() +
                " status=" + status +
                ", publishDate=" + publishDate +
                ", pageCount=" + pageCount +
                '}';
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void borrowItem(User user) {

    }

    @Override
    public void returnItem(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void repairItem() {

    }

    @Override
    public void updateItemCondition(ItemCondition condition) {

    }

    @Override
    public ItemCondition checkCondition() {
        return null;
    }
}
