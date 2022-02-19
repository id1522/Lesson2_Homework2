package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
	System.out.println("Ввдете температуру по °C");
        int g = k.nextInt();

    long a = 9;
    long b = 32;
    long c = 5;

        System.out.println("введенныя температура по шкале °C:  " + (g));
        System.out.println("значение по шкале °F:  " + (g*a/c+b));

    }
}