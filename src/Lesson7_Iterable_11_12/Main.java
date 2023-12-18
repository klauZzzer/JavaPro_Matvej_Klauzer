package Lesson7_Iterable_11_12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        IterableExample example = new IterableExample();
//        String text1 = "text";
//        String text2 = "abccba";
//        System.out.println(example.isPalindrome(text1));
//        System.out.println(example.isPalindrome(text2));

        Methods methods = new Methods();

        Map<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("A", "Mark");
        hashMap1.put("B", "Anna");
        hashMap1.put("C", "Alina");
        methods.printMap(hashMap1);
        System.out.println();

        Map<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("Alex", "Alex");
        hashMap2.put("Biba", "Alex");
        hashMap2.put("Roma", "Romanov");
        System.out.println(methods.findKeysByValue(hashMap2, "Alex"));
        System.out.println();

        Map<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("Aba", "Romanov");
        hashMap3.put("Kolya", "Romanov");
        System.out.println(methods.mergeMapsIfUniqueKeys(hashMap2, hashMap3));
        System.out.println();

        System.out.println(methods.invertMap(hashMap1));
        System.out.println();

        System.out.println(methods.countUniqueValues(hashMap2));
        System.out.println();

        Set<Map<Integer, String>> setOfMaps1 = new HashSet<>();
        Map<Integer, String> hashMap4 = new HashMap<>();
        hashMap4.put(1, "A");
        hashMap4.put(2, "B");
        Map<Integer, String> hashMap5 = new HashMap<>();
        hashMap5.put(3, "C");
        hashMap5.put(4, "D");
        hashMap5.put(5, "E");
        setOfMaps1.add(hashMap4);
        setOfMaps1.add(hashMap5);
        System.out.println(methods.findAllValues(setOfMaps1));
        System.out.println();

        System.out.println(methods.sumAllKeys(setOfMaps1));
        System.out.println();

        System.out.println(methods.containsValue(setOfMaps1, "C"));
        System.out.println();



    }
}
