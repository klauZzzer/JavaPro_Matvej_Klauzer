package Lesson_5_HashMap_04_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {
    //HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.

    public void findSameLength(HashMap<String, String> hashMap) {
        int temp = 0;
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getKey().length() == entry.getValue().length()) {
                temp++;
            }
        }
        System.out.println("Количество пар ключ-значение - " + temp);
    }

    //HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.

    public void sumOfKeysWithA(HashMap<String, Integer> hashMap) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey().charAt(0) == 'A' || entry.getKey().charAt(0) == 'a') {
                count += entry.getValue();
            }
        }
        System.out.println("Сумма значений с 'a' в начале - " + count);
    }

    //HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка, которые начинаются с гласной буквы.

    public void findOnlyConsonants(HashMap<Integer, List<String>> hashMap) {
        for (List<String> entry : hashMap.values()) {
            for (int i = 0; i < entry.size(); i++) {
                char temp = entry.get(i).charAt(0);
                switch (temp) {
                    case 'A':
                    case 'a':
                    case 'E':
                    case 'e':
                    case 'I':
                    case 'i':
                    case 'O':
                    case 'o':
                    case 'U':
                    case 'u':
                    case 'Y':
                    case 'y':
                        System.out.println(entry.get(i));
                        break;
                    default:
                        break;
                }
            }
        }
    }

    //HashMap<Integer, Integer>: Найдите ключ с максимальным значением и выведите эту пару.

    public void findBiggestKey(HashMap<Integer, Integer> hashMap) {
        int temp = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey() > temp) {
                temp = entry.getKey();
                value = entry.getValue();
            }
        }
        System.out.println("Ключ с максимальным значением и его пара - " + temp + ", " + value);
    }

    //HashMap<String, String>: Определите, содержит ли HashMap такую пару ключ-значение, где ключ является обратной строкой значения (например, ключ "abc", значение "cba").

    public void findInverseValue(HashMap<String, String> hashMap) {
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getKey().length() == entry.getValue().length()) {
                int temp1 = 1;
                int temp2 = 0;
                for (int i = 0; i < entry.getKey().length(); i++) {
                    if (entry.getKey().charAt(i) == entry.getValue().charAt(entry.getValue().length() - temp1)) {
                        temp1++;
                        temp2++;
                    }
                    if (temp2 == entry.getKey().length()-1) {
                        System.out.println(entry);
                    }
                }
            }
        }
    }

    //HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>, где каждое значение - это строковое представление исходного числа, умноженного на 2.

    public HashMap<String, String> conversionToString(HashMap<String, Integer> hashMap) {
        HashMap<String, String> newHashMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            newHashMap.put(entry.getKey(), String.valueOf(entry.getValue() * 2));
        }
        return newHashMap;
    }

    //HashMap<Integer, List<String>>: Создайте второй HashMap<Integer, Integer>, где каждый ключ - это ключ из исходного HashMap, а значение - общее количество символов во всех строках списка этого ключа.

    public HashMap<Integer, Integer> getCountOfSymbols(HashMap<Integer, List<String>> hashMap) {
        HashMap<Integer, Integer> newHashMap = new HashMap<>();
        for (Map.Entry<Integer, List<String>> entry : hashMap.entrySet()) {
            int temp = 0;
            for (String str : entry.getValue()) {
                temp += str.length();
            }
            newHashMap.put(entry.getKey(), temp);
        }
        return newHashMap;
    }

    //HashMap<Integer, Integer>: Найдите все пары ключ-значение, где ключ минус значение является простым числом.

    public void findPrimeNumbers(HashMap<Integer, Integer> hashMap) {
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() - entry.getKey() > 1 && (entry.getValue() - entry.getKey()) % 2 != 0 && (entry.getValue() - entry.getKey()) % 3 != 0) {
                System.out.println(entry);
            }
        }
    }

    //HashMap<String, String>: Определите, можно ли преобразовать HashMap в List<String>, где каждый элемент - это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными.

    public List<String> conversionToList(HashMap<String, String> hashMap) {
        String str1;
        String str2;
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            str1 = entry.getKey();
            str2 = entry.getValue();
            if (!stringList.contains(str1 + ", " + str2)) {
                stringList.add(str1 + ", " + str2);
            }
        }
        return stringList;
    }

    //HashMap<String, Integer> и HashMap<Integer, List<String>>: Для каждого ключа в HashMap<String, Integer> найдите соответствующие строки в HashMap<Integer, List<String>>, где ключ во втором HashMap - это значение из первого, и выведите их.



}
