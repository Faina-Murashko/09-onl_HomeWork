package com.lesson2.Homework2;

/*import java.util.Scanner;

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
}*/

import java.util.Random;

public class Month {
    public static void main(String[] args){
        String [] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Random Month = new Random();
        String monthName = month[Month.nextInt(5)];


        if(monthName.equals("Январь"))
            System.out.println("Вы выбрали месяц Январь");
        else if (monthName.equals("Февраль"))
            System.out.println("Вы выбрали месяц Январь");
        else if (monthName.equals("Март"))
            System.out.println("Вы выбрали месяц Март");
        else if (monthName.equals("Апрель"))
            System.out.println("Вы выбрали месяц Арель");
        else if (monthName.equals("Май"))
            System.out.println("Вы выбрали месяц Май");
        else if (monthName.equals("Июнь"))
            System.out.println("Вы выбрали месяц Июнь");
        else if (monthName.equals("Июль"))
            System.out.println("Вы выбрали месяц Июль");
        else if (monthName.equals("Август"))
            System.out.println("Вы выбрали месяц Август");
        else if (monthName.equals("Сентябрь"))
            System.out.println("Вы выбрали месяц Сентябрь");
        else if (monthName.equals("Октябрь"))
            System.out.println("Вы выбрали месяц Октябрь");
        else if (monthName.equals("Ноябрь"))
            System.out.println("Вы выбрали месяц Ноябрь");
        else if (monthName.equals("Декабрь"))
            System.out.println("Вы выбрали месяц Декабрь");
        else {
            System.out.println("Выберите месяц");
        }
