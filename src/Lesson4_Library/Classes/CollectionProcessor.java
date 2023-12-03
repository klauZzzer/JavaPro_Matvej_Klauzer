package Lesson4_Library.Classes;

import Lesson4_Library.Enums.BookStatus;
import Lesson4_Library.Enums.Genre;
import Lesson4_Library.Enums.ItemCondition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionProcessor {
    void printAllItems(List<LibraryItem> items) {
        for (int i = 0; i < items.size(); i++) {
            if (i == items.size()-1) {
                System.out.println(items.get(i) + ".");
            } else {
                System.out.println(items.get(i) + ",");
            }
        }
    }
    void listItemsByGenre(List<LibraryItem> items, Genre genre) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getGenre().equals(genre)) {
                System.out.println(items.get(i));
            }
        }
    }
    void sortByTitle(List<LibraryItem> items) {
        Comparator<LibraryItem> comparator = Comparator.comparing(LibraryItem::getTitle);
        items.sort(comparator);
        System.out.println("Отсортированный лист по названию - " + items);
    }
    void filterByAuthor(List<LibraryItem> items, String author) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getAuthor().equals(author)) {
                System.out.println(items.get(i));
            }
        }
    }
    void countItemsByStatus(List<LibraryItem> items, BookStatus status) {
        int temp = 0;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) instanceof Book) {
                Book bookTemp = (Book) items.get(i);
                if(bookTemp.getStatus().equals(status)) {
                    temp++;
                }
            }
        }
        System.out.println("Найдено - " + temp + " книг с таким статусом");
    }
    void updateStatus(List<LibraryItem> items, BookStatus oldStatus, BookStatus newStatus) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) instanceof Book) {
                Book bookTemp = (Book) items.get(i);
                if (bookTemp.getStatus().equals(oldStatus)) {
                    bookTemp.setStatus(newStatus);
                    items.set(i, bookTemp);
                }
            }
        }
        System.out.println("Статус книг изменен");
    }
    void listAvailableItems(List<LibraryItem> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
        System.out.println("Это весь список доступных товаров");
    }
    void findOldestItem(List<LibraryItem> items) {
        Book tempBook1 = null;
        Magazine tempMagazine1 = null;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) instanceof Book) {
                tempBook1 = (Book) items.get(i);
            } else {
                tempMagazine1 = (Magazine) items.get(i);
            }
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) instanceof Book) {
                Book tempBook2 = (Book) items.get(i);
                if (tempBook2.getPublishDate().isBefore(tempBook1.getPublishDate())) {
                    tempBook1 = tempBook2;
                }
            } else {
                Magazine tempMagazine2 = (Magazine) items.get(i);
                if (tempMagazine2.getReleaseDate().isBefore(tempMagazine1.getReleaseDate())) {
                    tempMagazine1 = tempMagazine2;
                }
            }
        }
        if (tempBook1.getPublishDate().isBefore(tempMagazine1.getReleaseDate())) {
            System.out.println("Это наш самый старый товар - " + tempBook1);
        } else {
            System.out.println("Это наш самый старый товар - " + tempMagazine1);
        }
    }
    void groupItemsByAuthor(List<LibraryItem> items) {
        List<String> author = new ArrayList<>();
        for (LibraryItem item : items) {
            if (!author.contains(item.getAuthor())) {
                author.add(item.getAuthor());
            }
        }
        for (String i : author) {
            System.out.print(i + " -");
            for (LibraryItem item : items) {
                if (item.getAuthor().equals(i)) {
                    System.out.print(" " + item.getTitle());
                }
            }
            System.out.println();
        }

    }
    void listItemsForRepair(List<LibraryItem> items) {
        int temp = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemCondition().equals(ItemCondition.SHABBY)) {
                System.out.println(items.get(i));
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println("Все эти вещи нужно отреставрировать");
        } else {
            System.out.println("Все товары в хорошем состоянии!");
        }
    }
    void displayItemCount(List<LibraryItem> items) {
        System.out.println("В библиотеке доступно - " + items.size() + " товаров");
    }
    void listBorrowedItemsByUser(User user) {
        if (user.getBorrowedItems() != null) {
            System.out.println("Читатель " + user.getName() + " взял книгу(книги) - ");
            for (int i = 0; i < user.getBorrowedItems().size(); i++) {
                System.out.println(user.getBorrowedItems().get(i));
            }
        } else {
            System.out.println("У читателя нет взятых книг");
        }
    }
    void removeLostItems(List<LibraryItem> items) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemCondition().equals(ItemCondition.LOST)) {
                items.remove(items.get(i));
            }
        }
        System.out.println("Все потерянные товары удалены из списка!");
    }
    void addItemToList(List<LibraryItem> items, LibraryItem item) {
        int temp = 0;
        for (int i = 0; i < items.size(); i++) {
            if (item.equals(items.get(i))) {
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println("Такой товар уже есть в списке");
        } else {
            items.add(item);
        }
    }
    void removeItemFromList(List<LibraryItem> items, LibraryItem item) {
        int temp = 0;
        for (int i = 0; i < items.size(); i++) {
            if (item.equals(items.get(i))) {
                temp++;
            }
        }
        if (temp > 0) {
            items.remove(item);
        } else {
            System.out.println("Такого товара нет в списке");
        }
    }

    void findMostPopularGenre(List<LibraryItem> items) {
        Genre famous = null;
        int temp = 0;
        List<Genre> genres = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (!genres.contains(items.get(i).getGenre())) {
                genres.add(items.get(i).getGenre());
            }
        }
        for (int i = 0; i < genres.size(); i++) {
            int count = 0;
            for (int j = 0; j < items.size(); j++) {
                if (genres.get(i).equals(items.get(j).getGenre())) {
                    count++;
                }
            }
            if (count>temp) {
                temp = count;
                famous = genres.get(i);
            }
        }
        System.out.println("Самой популярный жанр - " + famous);
    }
    void calculateAveragePageCount(List<Book> books) {
        int temp = 0;
        for (int i = 0; i < books.size(); i++) {
            temp += books.get(i).getPageCount();
        }
        temp = temp / books.size();
        System.out.println("Среднее количество страниц - " + temp);
    }
    void listMonthlyMagazines(List<Magazine> magazines) {
        int temp = 0;
        for (int i = 0; i < magazines.size(); i++) {
            if (magazines.get(i).isMonthly()) {
                System.out.println(magazines.get(i));
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println("Это все месячные журналы");
        } else {
            System.out.println("Сейчас у нас нет месячных журналов");
        }
    }
    void listItemsByCondition(List<LibraryItem> items, ItemCondition condition) {
        int temp = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemCondition().equals(condition)) {
                System.out.println(items.get(i));
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println("Это все товары в таком состоянии");
        } else {
            System.out.println("Товаров в таком состоянии нет!");
        }
    }
}
