package Lesson3_ArrayList_27_11.Part2;

import java.util.ArrayList;
import java.util.List;

public class Fifth {
    //- Разработать метод, который возвращает новый List, содержащий только уникальные элементы из исходного списка строк.

    public void removeDuplicates(List<Integer> integers) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            if (!temp.contains(integers.get(i))) {
                temp.add(integers.get(i));
            }
        }
        integers = temp;
        System.out.println(integers);
    }

}
