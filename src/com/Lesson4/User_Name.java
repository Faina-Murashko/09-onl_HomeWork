package com.Lesson4;

import java.sql.SQLOutput;

public class User_Name {
    private String name;
    private int age;

    public User_Name(){

    }

    public User_Name(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    public User_Name(String name){
        System.out.println(name);
        System.out.println(0);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;

        }*/

}