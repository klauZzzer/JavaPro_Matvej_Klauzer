package Lesson4_Library_29_11.Classes;

import Lesson4_Library_29_11.Enums.BookStatus;
import Lesson4_Library_29_11.Enums.Genre;
import Lesson4_Library_29_11.Enums.ItemCondition;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> libraryItemList = new ArrayList<>();

        Book book1;
        libraryItemList.add(book1 = new Book("Война мир", "Толстой", Genre.FICTION, ItemCondition.NEW
                ,BookStatus.AVAILABLE, LocalDate.of(1009, 7, 22), 600));
        Book book2;
        libraryItemList.add(book2 = new Book("Человек", "Антон Григорий", Genre.FANTASY, ItemCondition.SHABBY
                ,BookStatus.BORROWED, LocalDate.of(2000, 9, 25), 100));
        Book book3;
        libraryItemList.add(book3 = new Book("Робин Гуд", "Василий", Genre.FICTION, ItemCondition.SHABBY
                ,BookStatus.UNDER_REPAIR, LocalDate.of(2096, 10, 15), 300));
        Magazine magazine1;
        libraryItemList.add(magazine1 = new Magazine("Робин Гуд", "Василий", Genre.NON_FICTION, ItemCondition.LOST
                ,15, LocalDate.of(2096, 10, 15), false));
        List<LibraryItem> borrowedItems = new ArrayList<>();
        borrowedItems.add(book2);
        User userId1 = new User("John Jonson", "ID1", borrowedItems);
        Book book4 = new Book("Harry Potter", "Nolan Lens", Genre.FANTASY, ItemCondition.NEW
                ,BookStatus.AVAILABLE, LocalDate.of(2001, 9, 11), 201);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        List<Magazine> magazines = new ArrayList<>();
        magazines.add(magazine1);

        CollectionProcessor processor = new CollectionProcessor();

        processor.printAllItems(libraryItemList);
        System.out.println();
        processor.listItemsByGenre(libraryItemList, Genre.FANTASY);
        System.out.println();
        processor.sortByTitle(libraryItemList);
        System.out.println();
        processor.findOldestItem(libraryItemList);
        System.out.println();
        processor.filterByAuthor(libraryItemList, "Василий");
        System.out.println();
        processor.countItemsByStatus(libraryItemList, BookStatus.AVAILABLE);
        System.out.println();
        processor.updateStatus(libraryItemList, BookStatus.AVAILABLE, BookStatus.BORROWED);
        System.out.println();
        processor.listAvailableItems(libraryItemList);//переделывай
        System.out.println();
        processor.groupItemsByAuthor(libraryItemList);
        System.out.println();
        processor.listItemsForRepair(libraryItemList);
        System.out.println();
        processor.displayItemCount(libraryItemList);
        System.out.println();
        processor.listBorrowedItemsByUser(userId1);
        System.out.println();
        processor.removeLostItems(libraryItemList);
        System.out.println();
        processor.displayItemCount(libraryItemList);
        System.out.println();
        processor.addItemToList(libraryItemList, book4);
        processor.displayItemCount(libraryItemList);
        System.out.println();
        processor.removeItemFromList(libraryItemList, book2);
        processor.displayItemCount(libraryItemList);
        System.out.println();
        processor.findMostPopularGenre(libraryItemList);
        System.out.println();
        processor.calculateAveragePageCount(books);
        System.out.println();
        processor.listMonthlyMagazines(magazines);
        System.out.println();
        processor.listItemsByCondition(libraryItemList, ItemCondition.NEW);

    }


}
