package org.example;

import java.util.Scanner;

import static org.example.Calculator.calculate;
/*Создать два класса Animal (super,родительский,базовый) и класс Cat (наследник).

-Класс Animal должен иметь следуюющие приватные поля vegetarian (boolean ), eats (String ), noOfLegs (int). Должен иметь гетеры и сетеры для,
а также два конструктора: первый принимает все параметры полей, второй без параметров.

-Класс Cat должен расширять (наследовать) класс Animal. должен иметь приватное поле color (String). Сетер и гетер для него. иметь два конструктора:

--первый принимает параметры все параметры для конструирования себя (color) и родительскогокласса

-- второй принимает параметры для конструирования родительского, класса color-по умолчанию*/

public class Main {

    public static void main(String[] args) {

Cat cat = new Cat(true,"Lion",6,"green");
    }
}

