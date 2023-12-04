package Lesson3_ArrayList_27_11.Part2;

import java.util.List;

public class Second {
    //- Составить метод, который объединяет все строки из List в одну большую строку.

    public void appendAllStrings(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            if (i == strings.size() - 1) {
                stringBuilder.append(strings.get(i)).append(".");
            } else {
                stringBuilder.append(strings.get(i)).append(", ");
            }
        }
        System.out.println(stringBuilder);
    }
}
