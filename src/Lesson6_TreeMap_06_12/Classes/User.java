package Lesson6_TreeMap_06_12.Classes;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class User implements Comparable<User> {
    //**Создайте класс User с полями name и age, реализующий Comparable
    //для сортировки по возрасту. Используйте TreeMap<User, String>
    //для хранения информации о пользователях и переберите его, чтобы напечатать имена.

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}


