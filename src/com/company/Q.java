package com.company;

import java.util.Random;
import java.util.Scanner;

public class Q {

    public static boolean addQ(Random rand, Scanner INPUT){
        int first = rand.nextInt(100);
        int second =rand.nextInt(100);
        String answer = Integer.toString(first+second);
        System.out.print(first+" + " +second +" = ______\n>");
        String userAnswer = INPUT.nextLine();
        if (answer.equalsIgnoreCase(userAnswer)){
            return true;
        }
        else{
            return false;
        }


    }

    public static boolean simpleSub (Random rand, Scanner INPUT){
        int first = rand.nextInt(100);
        int second = rand.nextInt(first+1);
        String answer = Integer.toString(first-second);
        System.out.print(first+" - " +second +" = ______ \n>");
        String userAnswer = INPUT.nextLine();
        if (answer.equalsIgnoreCase(userAnswer)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean powerOf (Random rand, Scanner INPUT){
        int first = rand.nextInt(50);
        int second = rand.nextInt(11);
        int count = 1;
        for (int i = 0; i < second; i++) {
            count*=first;

        }
        String answer = Integer.toString(count);
        System.out.print(first+" to the power of " +second +" = ______\n>");
        String userAnswer = INPUT.nextLine();
        if (answer.equalsIgnoreCase(userAnswer)){
            return true;
        }
        else{
            return false;
        }

    }
    public static float exponent(int num, int exponent){
        float total=1;
        if (exponent>=0){
            for (int i = 0; i < exponent; i++) {
                total*=num;
            }
        }
        else{
            for (int i = 0; i < exponent/-1; i++) {
                total/=num;
            }
        }
        return total;
    }

}


