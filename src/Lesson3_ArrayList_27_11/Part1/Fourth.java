package Lesson3_ArrayList_27_11.Part1;

import java.util.ArrayList;
import java.util.Arrays;

public class Fourth {
    //- Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.

    public void turn(int[] array) {
        int temp = 0;
        int j = 1;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-j];
            array[array.length-j] = temp;
            j++;
        }
        System.out.println(Arrays.toString(array));
    }

    public void turn(ArrayList<Integer> arrayList) {
        int temp = 0;
        int j = 1;
        for (int i = 0; i < arrayList.size()/2; i++) {
            temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size()-j));
            arrayList.set(arrayList.size()-j, temp);
            j++;
        }
        System.out.println(arrayList);
    }
}
