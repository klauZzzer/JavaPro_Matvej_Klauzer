package Lesson3_ArrayList_27_11.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Third {
    //- Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.

    public void removeDuplicates(int[] array) {
        Arrays.sort(array);
        int a = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                array[i] = 0;
                a++;
            }
        }
        int[] temp = new int[array.length-a];
        int tempNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                temp[tempNum] = array[i];
                tempNum++;
            }
        }
        array = temp;
        System.out.println(Arrays.toString(array));
    }

    public void removeDuplicates(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        int a = 0;
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
                arrayList.set(i, 0);
                a++;
            }
        }
        ArrayList<Integer> temp = new ArrayList<>(arrayList.size()-a);
        int tempNum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != 0) {
                temp.add(arrayList.get(i));
                tempNum++;
            }
        }
        arrayList = temp;
        System.out.println(arrayList);
    }
}
