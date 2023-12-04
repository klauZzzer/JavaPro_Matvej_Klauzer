package Lesson3_ArrayList_27_11.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Second {
    //- Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.

    public void howMuchAre(int[] array) {
        Arrays.sort(array);
        int temp = 0;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == array[i+1]) {
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    temp++;
                }
            }
            System.out.println("Элемент - " + array[i] + " встречается " + temp + " раз.");
            temp = 0;
        }
    }

    public void howMuchAre(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        int temp = 0;
        for (int i = 0; i < arrayList.size() -1; i++) {
            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
                continue;
            }
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    temp++;
                }
            }
            System.out.println("Элемент - " + arrayList.get(i) + " встречается " + temp + " раз.");
            temp = 0;
        }
    }
}
