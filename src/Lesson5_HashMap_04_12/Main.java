package Lesson5_HashMap_04_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();

        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("Papa", "Mama");
        hashMap1.put("Anton", "Peter");
        hashMap1.put("Anna", "David");
        hashMap1.put("Dima", "Alina");
        hashMap1.put("Yana", "Alex");
        methods.findSameLength(hashMap1);
        System.out.println();

        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("Abc", 20);
        hashMap2.put("Bca", 10);
        hashMap2.put("CAb", 15);
        hashMap2.put("Cac", 25);
        hashMap2.put("aab", 5);
        methods.sumOfKeysWithA(hashMap2);
        System.out.println();

        List<String> strings1 = new ArrayList<>();
        strings1.add("Anna");
        strings1.add("Markus");
        strings1.add("olga");
        List<String> strings2 = new ArrayList<>();
        strings2.add("Yana");
        strings2.add("Dima");
        strings2.add("Dominic");
        List<String> strings3 = new ArrayList<>();
        strings3.add("Ura");
        strings3.add("Peter");
        strings3.add("alina");
        HashMap<Integer, List<String>> hashMap3 = new HashMap<>();
        hashMap3.put(1, strings1);
        hashMap3.put(2, strings2);
        hashMap3.put(3, strings3);
        methods.findOnlyConsonants(hashMap3);
        System.out.println();

        HashMap<Integer, Integer> hashMap4 = new HashMap<>();
        hashMap4.put(25, 5);
        hashMap4.put(5, 10);
        hashMap4.put(11, 9);
        hashMap4.put(2112, 21);
        hashMap4.put(12, 6);
        methods.findBiggestKey(hashMap4);
        System.out.println();

        HashMap<String, String> hashMap5 = new HashMap<>();
        hashMap5.put("abc", "cba");
        hashMap5.put("Nolan", "naloN");
        hashMap5.put("Alina", "Nika");
        methods.findInverseValue(hashMap5);
        System.out.println();


        HashMap<String, Integer> hashMap6 = new HashMap<>();
        hashMap6.put("A", 10);
        hashMap6.put("B", 20);
        hashMap6.put("C", 30);
        hashMap6.put("D", 40);
        hashMap6.put("E", 50);
        System.out.println(methods.conversionToString(hashMap6));
        System.out.println();

        HashMap<Integer, List<String>> hashMap7 = new HashMap<>();
        hashMap7.put(1,strings1);
        hashMap7.put(2,strings2);
        hashMap7.put(3,strings3);
        System.out.println(methods.getCountOfSymbols(hashMap7));
        System.out.println();

        HashMap<Integer, Integer> hashMap8 = new HashMap<>();
        hashMap8.put(1, 48);
        hashMap8.put(2, 22);
        hashMap8.put(3, 16);
        hashMap8.put(4, 15);
        hashMap8.put(5, 15);
        methods.findPrimeNumbers(hashMap8);
        System.out.println();

        HashMap<String, String> hashMap9 = new HashMap<>();
        hashMap9.put("Second", "Potter");
        hashMap9.put("Third", "Tom");
        hashMap9.put("First", "Harry");
        hashMap9.put("Fourth", "John");
        hashMap9.put("Fifth", "Jonson");
        System.out.println(methods.conversionToList(hashMap9));





    }
}
