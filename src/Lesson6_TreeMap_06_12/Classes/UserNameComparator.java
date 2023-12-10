package Lesson6_TreeMap_06_12.Classes;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {

    //**Создайте TreeMap<User, String> (класс User как в задаче 3), но на
    //этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.

    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
