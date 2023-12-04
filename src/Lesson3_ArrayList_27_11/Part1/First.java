package Lesson3_ArrayList_27_11.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class First {
    //- Дан массив/коллекция целых чисел и целое число X. Найти пару чисел в массиве/коллекции, сумма которых равна X.

    public void sumOf2Numbers(int[] array, int number) {
        Arrays.sort(array);
        int i = 0;
        int j = array.length-1;

        while (array[i] + array[j] != number ) {
            if (array[i] + array[j] < number) {
                i++;
            } else {
                j--;
            }
        }
        if (array[i] + array[j] == number) {
            System.out.println("Пара чисел найдена - " + array[i] + " и " + array[j]);
        }
    }

    public void sumOf2Numbers(ArrayList<Integer> arrayList, int number) {
        Collections.sort(arrayList);
        int i = 0;
        int j = arrayList.size()-1;

        while (arrayList.get(i) + arrayList.get(j) != number ) {
            if (arrayList.get(i) + arrayList.get(j) < number) {
                i++;
            } else {
                j--;
            }
        }
        if (arrayList.get(i) + arrayList.get(j) == number) {
            System.out.println("Пара чисел найдена - " + arrayList.get(i) + " и " + arrayList.get(j));
        }

    }

}
