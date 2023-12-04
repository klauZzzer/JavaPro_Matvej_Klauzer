package Lesson3_ArrayList_27_11.Part2;

import java.util.ArrayList;
import java.util.List;

public class Third {
    //- Дан List 1,написать метод который создает List 2, содержащий только те числа из List 1, которые больше заданного значения.

    public void addOnlyBiggerThen(List<Integer> list1, int number) {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) > number) {
                list2.add(list1.get(i));
            }
        }
        System.out.println("Новый список:");
        System.out.println(list2);
    }

}
