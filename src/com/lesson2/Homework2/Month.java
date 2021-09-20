package com.lesson2.Homework2;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner chMonth = new Scanner(System.in);
        String month = chMonth.nextLine();
        switch (month) {
            case "December":
            case "Fabruary":
            case "January":
                System.out.println("Whinter");
                break;


            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;

            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;

            case "September":
            case "October": ;
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("No Month");
                break;
        }
    }
}
