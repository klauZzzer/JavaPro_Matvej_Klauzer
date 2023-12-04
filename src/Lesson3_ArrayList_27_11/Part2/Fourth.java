package Lesson3_ArrayList_27_11.Part2;

import java.util.ArrayList;
import java.util.List;

public class Fourth {
    //- Написать метод, который преобразует List<String> в List<Integer>, представляющих длину каждой строки.

    public void getLength(List<String> strings) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            integers.add(strings.get(i).length());
        }
        System.out.println(integers);
    }

}
