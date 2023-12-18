package Lesson7_Iterable_11_12;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Methods {

    public void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public Set<String> findKeysByValue(Map<String, String> map, String value) {
        Set<String> stringSet = new HashSet<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                stringSet.add(entry.getKey());
            }
        }
        return stringSet;
    }

    public Map<String, String> mergeMapsIfUniqueKeys(Map<String, String> map1, Map<String, String> map2) {
        int temp = 0;
        for (String entry : map1.keySet()) {
            if (map2.containsKey(entry)) {
                temp++;
            }
        }
        if (temp == 0) {
            map1.putAll(map2);
            return map1;
        } else {
            System.out.println("Ключи в мапах не уникальны!");
            return null;
        }
    }

    public Map<String, String> invertMap(Map<String, String> map) {
        Map<String, String> invertedMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }

    public int countUniqueValues(Map<String, String> map) {
        Set<String> uniqueValues = new HashSet<>(map.values());
        int temp = uniqueValues.size();
        if (temp == 0) {
            System.out.println("В мапе нет уникальных значений!");
        }

        return temp;
    }

    public Set<String> findAllValues(Set<Map<Integer, String>> setOfMaps) {
        Set<String> stringSet = new HashSet<>();
        for (Map<Integer, String> entry : setOfMaps) {
                stringSet.addAll(entry.values());
        }
        return stringSet;
    }

    //int sumAllKeys(Set<Map<Integer, String>> setOfMaps) {
    //}Найти сумму всех ключей всех мап.

    public int sumAllKeys(Set<Map<Integer, String>> setOfMaps) {
        int temp = 0;
        for (Map<Integer, String> entry : setOfMaps) {
            for (int key : entry.keySet()) {
                temp += key;
            }
        }
        return temp;
    }

    //boolean containsValue(Set<Map<Integer, String>> setOfMaps, String value) {
    //}Определить, содержится ли заданная строка как значение хотя бы в одной из мапы.

    public boolean containsValue(Set<Map<Integer, String>> setOfMaps, String value) {
        for (Map<Integer, String> entry : setOfMaps) {
            for (String string : entry.values()) {
                if (string.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Set<String> findAllStringsWithChar(Set<Map<Character, Set<String>>> complexSet, char c) {
    //}Найти все строки, которые начинаются с заданного символа во всех вложенных сетах.

    public Set<String> findAllStringsWithChar(Set<Map<Character, Set<String>>> complexSet, char c) {
        Set<String> temp = new HashSet<>();
        for (Map<Character, Set<String>> entry : complexSet) {
            for (Set<String> stringSet : entry.values()) {
                for (String string : stringSet) {
                    if (string.charAt(0) == c) {
                        temp.add(string);
                    }
                }
            }
        }
        return temp;
    }

    //Map<Character, Integer> countStringOccurrences(Set<Map<Character, Set<String>>> complexSet) {
    //}Создать мапу, где ключами являются символы, а значениями - количество раз, которое
    //строки начинающиеся на этот символ встречаются во всех вложенных сетах.

}
