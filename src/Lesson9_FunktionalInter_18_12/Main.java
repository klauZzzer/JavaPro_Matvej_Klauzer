package Lesson9_FunktionalInter_18_12;

import Lesson9_FunktionalInter_18_12.Interfaces.SafeDivision;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();

        methods.getLength(el -> System.out.println(el.length()), "mama");
        System.out.println();

        methods.operator((first, second) -> System.out.println(first + second), 30, 15);
        methods.operator((first, second) -> System.out.println(first - second), 30, 15);
        methods.operator((first, second) -> System.out.println(first / second), 30, 15);
        methods.operator((first, second) -> System.out.println(first * second), 30, 15);
        System.out.println();

        SafeDivision safeDivide = (a, b) -> b == 0 ? Optional.empty() : Optional.of(a / b);
        //System.out.println(methods.divide(safeDivide, 300, 0));
        System.out.println("Результат: " + methods.divide(safeDivide, 0, 300).orElse(Double.NaN));


        System.out.println();


    }
}
