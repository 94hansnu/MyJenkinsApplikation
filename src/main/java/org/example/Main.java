package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String myMessage = "Hello World";
    private static int number1 = 3;
    private static int number2 = 7;
    public static void main(String[] args) {

        System.out.println(String.format("%s, number %d", myMessage, number1));
    }

    public int add(){
        int sum = number1 + number2;
        return sum;
    }
}