package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
	System.out.println("Ввдете температуру по °C");
        int number1 = k.nextInt();

    long a = 9;
    long b = 32;
    long c = 5;

        System.out.println("введенныя температура в °C");
        System.out.println(number1);
        System.out.println("значение по °F");
        System.out.println(number1*a/c+b);

    }
}