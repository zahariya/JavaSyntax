package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write a and b");

        String input = Console.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int result = a*b;
        System.out.println(result);
    }
}
