package Lesson4_Library.Classes;

import Lesson4_Library.Enums.Genre;
import Lesson4_Library.Enums.ItemCondition;

import java.time.LocalDate;

public class Magazine extends LibraryItem {
    private int issueNumber;

    private LocalDate releaseDate;
    private boolean isMonthly;


    public Magazine(String title, String author, Genre genre, ItemCondition itemCondition, int issueNumber, LocalDate releaseDate, boolean isMonthly) {
        super(title, author, genre, itemCondition);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
        this.isMonthly = isMonthly;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title=" + getTitle() +
                " author=" + getAuthor() +
                " genre=" + getGenre() +
                " ItemCondition=" + getItemCondition() +
                " issueNumber=" + issueNumber +
                ", releaseDate=" + releaseDate +
                ", isMonthly=" + isMonthly +
                '}';
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    public void setMonthly(boolean monthly) {
        isMonthly = monthly;
    }
}
