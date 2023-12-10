package Lesson6_TreeMap_06_12.Classes;

import Lesson6_TreeMap_06_12.Classes.User;

import java.util.*;

public class Methods {
    //**Создайте HashMap<String, Integer>, заполните его парами
    //"имя-возраст". Используйте цикл for-each для удвоения возраста каждого человека.

    public Map<String, Integer> makeDoubledYears(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue() * 2);
        }
        return map;
    }

    //***Создайте HashMap<Integer, String>, представляющий
    //"ID-имя пользователя". Используйте цикл для фильтрации
    //пользователей с ID больше 100 и копируйте их в TreeMap.

    public Map<Integer, String> filterId(Map<Integer, String> map) {
        Map<Integer, String> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 100) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        return treeMap;
    }

    //**Создайте класс User с полями name и age, реализующий Comparable
    //для сортировки по возрасту. Используйте TreeMap<User, String>
    //для хранения информации о пользователях и переберите его, чтобы напечатать имена.

    public void getNamesOfUsers(Map<User, String> treeMap) {
        for (User entry : treeMap.keySet()) {
            System.out.println(entry.getName());
        }
    }

    //**Создайте два HashMap<String, User> (класс User как в задаче 3) и
    //объедините их в один, удалив дубликаты пользователей.

    public Map<String, User> combineHashMaps(Map<String, User> first, Map<String, User> second) {
        Map<String, User> result = new HashMap<>();
        int temp = 1;
        for (Map.Entry<String, User> entry : first.entrySet()) {
            if (!result.containsValue(entry.getValue())) {
                result.put(String.valueOf(temp), entry.getValue());
                temp++;
            }
        }
        for (Map.Entry<String, User> entry : second.entrySet()) {
            if (!result.containsValue(entry.getValue())) {
                result.put(String.valueOf(temp), entry.getValue());
                temp++;
            }
        }
        return result;
    }

    //**Создайте HashMap<Integer, String> и перепишите его в TreeMap<String, Integer>,
    //инвертируя ключи и значения.

    public Map<String, Integer> hashMapToTreeMap(Map<Integer, String> hashMap) {
        Map<String, Integer> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            treeMap.put(entry.getValue(), entry.getKey());
        }
        return treeMap;
    }

    //**Создайте HashMap<String, Integer>, переберите её и создайте List<Integer>,
    //содержащий все значения HashMap.

    public List<Integer> HashMapToList(Map<String, Integer> hashMap) {
        List<Integer> integerList = new ArrayList<>();
        for (int entry : hashMap.values()) {
            integerList.add(entry);
        }
        return integerList;
    }

    //**Создайте TreeMap<String, Integer> и переберите его, создавая HashMap<Integer, String>,
    //включающий только те записи, где значение больше 50.

    public Map<Integer, String> treeMapToHashMap(Map<String, Integer> treeMap) {
        Map<Integer, String> hashMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() > 50) {
                hashMap.put(entry.getValue(), entry.getKey());
            }
        }
        return hashMap;
    }


    //**Создайте HashMap<String, List<Integer>>, где ключ - это имя, а значение - список оценок.
    //Используйте TreeMap<Integer, List<String>> для создания отображения
    //"средняя оценка - список студентов с этой оценкой".



}
