package com.lesson2.Homework2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner Letters = new Scanner(System.in);
        String str = Letters.next("Это буква");
        char valueChar = str.charAt(0);

        if (valueChar == 'O' | valueChar == 'e' | valueChar == 'i' | valueChar == 'u') {
            System.out.println("Это гласная буква");
        } else {
            System.out.println("Это согласная буква");

        }


    }
    }

