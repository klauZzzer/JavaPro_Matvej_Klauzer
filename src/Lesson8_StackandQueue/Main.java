package Lesson8_StackandQueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();

        System.out.println(methods.reverse("Morty"));
        System.out.println();

        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Mark");
        queue1.add("Morty");
        queue1.add("Anna");
        queue1.add("Alina");
        queue1.add("Peter");
        methods.printInReverse(queue1);
        System.out.println();

        Queue<String> queue2 = new LinkedList<>();
        queue2.add("A");
        queue2.add("B");
        queue2.add("C");
        queue2.add("D");
        queue2.add("E");
        methods.rotate(queue2, 3);
        System.out.println();

        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Alex");
        map1.put("2", "John");
        map1.put("3", "Moris");
        methods.changeValue(map1, "2", "Anna");
        System.out.println();

        System.out.println(methods.invert(map1));
        System.out.println();

        System.out.println(methods.primeFactorization(121));
        System.out.println(methods.primeFactorization(228));
        System.out.println(methods.primeFactorization(117));
        System.out.println();

        System.out.println(methods.areAnagrams("car", "arc"));
        System.out.println(methods.areAnagrams("satisfaction", "arc"));
        System.out.println(methods.areAnagrams("abcd", "abba"));


    }
}
