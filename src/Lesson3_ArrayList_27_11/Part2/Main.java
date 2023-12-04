package Lesson3_ArrayList_27_11.Part2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //- Реализовать метод, который удаляет все вхождения заданной строки из List<String>.
        //- Составить метод, который объединяет все строки из List в одну большую строку.
        //- Дан List 1,написать метод который создает List 2, содержащий только те числа из List 1, которые больше заданного значения.
        //- Написать метод, который преобразует List<String> в List<Integer>, представляющих длину каждой строки.
        //- Разработать метод, который возвращает новый List, содержащий только уникальные элементы из исходного списка строк.

        First first = new First();
        Second second = new Second();
        Third third = new Third();
        Fourth fourth = new Fourth();
        Fifth fifth = new Fifth();

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Harri");
        stringList1.add("Harry");
        stringList1.add("Potter");
        stringList1.add("Harri");
        stringList1.add("Harri");
        first.removeString(stringList1, "Harri");
        System.out.println();

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("First");
        stringList2.add("Second");
        stringList2.add("Third");
        stringList2.add("Fourth");
        stringList2.add("Fifth");
        second.appendAllStrings(stringList2);
        System.out.println();

        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);
        integerList1.add(5);
        third.addOnlyBiggerThen(integerList1, 2);
        System.out.println();

        List<String> stringList3 = new ArrayList<>();
        stringList3.add("A");
        stringList3.add("AB");
        stringList3.add("ABC");
        stringList3.add("ABCD");
        stringList3.add("ABCDE");
        fourth.getLength(stringList3);
        System.out.println();

        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(1);
        integerList2.add(1);
        integerList2.add(2);
        integerList2.add(3);
        integerList2.add(1);
        integerList2.add(3);
        fifth.removeDuplicates(integerList2);

    }
}
