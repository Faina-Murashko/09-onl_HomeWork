package Lesson2_2;

import java.util.Random;

public class Letters {
    public static void main(String[] args){
        Random letters = new Random();

        for  ( int L = 0 ; L < 100; L++){
            int c = letters.nextInt(26) + 'a';
            System.out.println((char) c + "");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Гласная");
                case 'y':
                case 'w':
                    System.out.println("Условная гласная");
                default:
                    System.out.println("Согласная");
                    break;

            }
        }
    }
}
