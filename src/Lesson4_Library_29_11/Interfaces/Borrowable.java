package Lesson4_Library_29_11.Interfaces;

import Lesson4_Library_29_11.Classes.User;

public interface Borrowable {
    void borrowItem(User user);

    void returnItem(User user);

    boolean isAvailable();
}
