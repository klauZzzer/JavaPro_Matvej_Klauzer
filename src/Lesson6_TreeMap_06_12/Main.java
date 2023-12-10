package Lesson6_TreeMap_06_12;

import Lesson6_TreeMap_06_12.Classes.Methods;
import Lesson6_TreeMap_06_12.Classes.User;
import Lesson6_TreeMap_06_12.Classes.UserNameComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();

        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Alina", 20);
        hashMap1.put("Alex", 21);
        hashMap1.put("Anton", 12);
        hashMap1.put("Nolan", 13);
        hashMap1.put("Mark", 25);
        System.out.println(methods.makeDoubledYears(hashMap1));
        System.out.println();

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(1, "Garry");
        hashMap2.put(1001, "Denis");
        hashMap2.put(101, "Mark");
        hashMap2.put(121, "Anton");
        hashMap2.put(2, "Alina");
        System.out.println(methods.filterId(hashMap2));
        System.out.println();

        Map<User, String> treeMap1 = new TreeMap<>();
        User id1 = new User("Anton", 27);
        User id2 = new User("Alina", 21);
        User id3 = new User("Dima", 13);
        User id4 = new User("Mark", 17);
        User id5 = new User("Nolan", 35);
        treeMap1.put(id1, "sasasa");
        treeMap1.put(id2, "dsdsds");
        treeMap1.put(id3, "fdfdfd");
        treeMap1.put(id4, "gfgfgf");
        treeMap1.put(id5, "hghghg");
        System.out.println(treeMap1);
        methods.getNamesOfUsers(treeMap1);
        System.out.println();

        //**Создайте TreeMap<User, String> (класс User как в задаче 3), но на
        //этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.
        Map<User, String> treeMap2 = new TreeMap<>(new UserNameComparator());
        treeMap2.put(id1, "sasasa");
        treeMap2.put(id2, "dsdsds");
        treeMap2.put(id3, "fdfdfd");
        treeMap2.put(id4, "gfgfgf");
        treeMap2.put(id5, "hghghg");
        System.out.println(treeMap2);
        System.out.println();

        Map<String, User> hashMap3 = new HashMap<>();
        hashMap3.put("1", id1);
        hashMap3.put("2", id1);
        hashMap3.put("3", id3);
        Map<String, User> hashMap4 = new HashMap<>();
        hashMap4.put("4", id3);
        hashMap4.put("5", id2);
        hashMap4.put("6", id4);
        System.out.println(hashMap3);
        System.out.println(hashMap4);
        System.out.println(methods.combineHashMaps(hashMap3, hashMap4));
        System.out.println();

        Map<Integer, String> hashMap5 = new HashMap<>();
        hashMap5.put(1, "ABC");
        hashMap5.put(2, "DEF");
        hashMap5.put(3, "GOD");
        hashMap5.put(4, "CAT");
        hashMap5.put(5, "MAD");
        System.out.println(methods.hashMapToTreeMap(hashMap5));
        System.out.println();

        System.out.println(hashMap1);
        System.out.println(methods.HashMapToList(hashMap1));
        System.out.println();

        Map<String, Integer> treeMap3 = new TreeMap<>();
        treeMap3.put("1", 51);
        treeMap3.put("2", 70);
        treeMap3.put("3", 25);
        treeMap3.put("4", 21);
        treeMap3.put("5", 121);
        System.out.println(methods.treeMapToHashMap(treeMap3));
        System.out.println();




    }
}
