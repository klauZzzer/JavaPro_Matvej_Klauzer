package Lesson4_Library.Interfaces;

import Lesson4_Library.Classes.User;

public interface Borrowable {
    void borrowItem(User user);

    void returnItem(User user);

    boolean isAvailable();
}
