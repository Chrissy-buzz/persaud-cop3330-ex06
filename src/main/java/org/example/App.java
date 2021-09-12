package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static int sub (int num1, int num2){
        int i;
        i= num1 - num2;
        return i;
    }

    public static void main(String[] args) {

        int ThisYear = Calendar.getInstance().get(Calendar.YEAR);
        int Congratulations = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String str = input.nextLine();
        int age;
        try {
            age = Integer.valueOf(str);
            if (age < 0) {
                throw new IllegalArgumentException("You may retire now :).");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.print("At what age would you like to retire? ");
        String str2 = input.nextLine();
        Integer retireAge;
        try {
            retireAge = Integer.valueOf(str2);
            if (retireAge < 0) {
                throw new IllegalArgumentException("You may retire now :).");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }

        if (retireAge < age) {
            System.out.print("You may retire now :).");
        } else {

            int TimeLeft = sub(retireAge, age);
            System.out.print("It's " + ThisYear + ", " + "so you can retire in " + (ThisYear + TimeLeft) + ".");
        }
    }
}
