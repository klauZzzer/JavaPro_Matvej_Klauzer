package Lesson8_StackandQueue;

import java.util.*;

public class Methods {
    //Реализуйте функцию, которая использует Stack<String> для реверса строки.
    //  public static String reverse(String str)

    public String reverse(String string) {
        Stack<Character> characters = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            characters.add(string.charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append(characters.pop());
        }
        return stringBuilder.toString();
    }

    // Печать элементов Queue в обратном порядке
    //  public static void printInReverse(Queue<String> queue)

    public void printInReverse(Queue<String> queue) {
        Stack<String> tempStack = new Stack<>();
        int temp = queue.size();
        for (int i = 0; i < temp; i++) {
            tempStack.add(queue.poll());
        }
        for (int i = 0; i < temp; i++) {
            System.out.println(tempStack.pop());
        }
    }

    //Реализуйте функцию, которая осуществляет циклический сдвиг элементов в Queue<String>.
    //  public static void rotate(Queue<String> queue, int k)

    public void rotate(Queue<String> queue, int k) {
        String temp;
        k = queue.size() - k % queue.size();
        for (int i = 0; i < k; i++) {
            temp = queue.remove();
            queue.add(temp);
        }
        System.out.println(queue);
    }

    //- Создайте Map<String, String>, добавьте в него несколько пар ключ-значение,
    //  затем найдите определенный ключ и замените его значение.
    //  Map<String, String> map = new HashMap<>();
    //         map.put("A", "C");
    //         map.put("B", "D");

    public void changeValue(Map<String, String> map, String key, String value) {
        int temp = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Такого ключа нет!");
        } else {
            System.out.println(map);
        }
    }

    //- Инвертируйте Map<String, String>, чтобы ключи стали значениями, а значения ключами.
    //  public static Map<String, String> invert(Map<String, String> map)

    public Map<String, String> invert(Map<String, String> map) {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            tempMap.put(entry.getValue(), entry.getKey());
        }
        return map = tempMap;
    }

    //- Написать функцию, которая выполняет факторизацию(подуглить) числа и возвращает
    //  ее в виде Map, где ключ - это простой множитель, а значение - степень этого множителя.
    //  Public Map<Integer, Integer> primeFactorization(int number)

    public Map<Integer, Integer> primeFactorization(int number) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp = 1;
        while (number != 1) {
            if (number % temp == 0) {
                map.put(number, temp);
                number /= temp;
                temp = 1;
            }
            temp++;
        }
        return map;
    }

    //- Написать функцию, которая проверяет, являются ли две строки анаграммами друг друга.
    //  public boolean areAnagrams(String str1, String str2)

    public boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] temp1 = str1.toCharArray();
        char[] temp2 = str2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if (Arrays.equals(temp1, temp2)) {
            return true;
        }
        return false;
    }

}
