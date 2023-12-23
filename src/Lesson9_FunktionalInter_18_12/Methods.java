package Lesson9_FunktionalInter_18_12;

import Lesson9_FunktionalInter_18_12.Interfaces.NumberOperation;
import Lesson9_FunktionalInter_18_12.Interfaces.SafeDivision;
import Lesson9_FunktionalInter_18_12.Interfaces.StringLength;

import java.util.Optional;

public class Methods {

    //Создайте функциональный интерфейс StringLength с методом getLength, который принимает строку и возвращает её длину.
    //Напишите метод, который принимает строку и StringLength интерфейс и выводит длину строки.

    public void getLength(StringLength stringLength, String s) {
        stringLength.getLength(s);
    }

    //Создайте функциональный интерфейс NumberOperation с методом operate, который принимает два целых числа и возвращает целое число.
    //Напишите методы для выполнения базовых арифметических операций (сложение, вычитание, умножение, деление) с использованием этого интерфейса.

    public void operator(NumberOperation numberOperation, int first, int second) {
        numberOperation.operate(first, second);
    }

    //Создайте функциональный интерфейс SafeDivision с методом divide, который безопасно делит два числа и возвращает Optional<Double>.
    //Реализуйте метод, который делит два числа с использованием SafeDivision, обрабатывая случай деления на ноль.

    public Optional<Double> divide(SafeDivision safeDivision, double first, double second) {
        return safeDivision.divide(first, second);
    }

}
