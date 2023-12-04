package Lesson3_ArrayList_27_11.Part2;

import java.util.ArrayList;
import java.util.List;

public class First {
    //Реализовать метод, который удаляет все вхождения заданной строки из List<String>.

    public void removeString(List<String> strings, String string) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (!strings.get(i).equals(string)) {
                temp.add(strings.get(i));
            }
        }
        strings = temp;
        System.out.println(strings);
    }

}
