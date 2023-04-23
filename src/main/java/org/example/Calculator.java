package org.example;

public class Calculator {
    public static void calculate(int number1,int number2,String simbol){
        switch(simbol){
            case "+":
                plus(number1,number2);
                break;
            case "-":
                minus(number1,number2);
                break;
            case "/":
                divide(number1,number2);
                break;
            case "*":
                multiply(number1,number2);
                break;
            case "%":
                percent(number1,number2);
                break;
            default:
                System.out.println("Something went wrong");
        }

    }

    private static void plus(int number1,int number2)
    {
        System.out.println(number1+number2);
    }
    private static void minus(int number1,int number2)
    {
        System.out.println(number1-number2);
    }
    private static void multiply(int number1,int number2)//умножение
    {
        System.out.println(number1*number2);
    }
    private static void  divide(int number1,int number2) //деление
    {
        if(number2==0){
            System.out.println(" can't divide by zero ");
        }
        System.out.println(number1/number2);
    }
    private static void percent(int number1,int number2)//процент
    {
        System.out.println((number1*number2)/100);
    }

}

