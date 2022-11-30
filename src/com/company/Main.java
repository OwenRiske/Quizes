package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner INPUT = new Scanner(System.in);
        String[] options= {"1. add","2. simple subtraction","3. power of"};
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);

        }
        System.out.print(">");
        String userChoice = INPUT.nextLine();


        while (true){
            if (userChoice.equalsIgnoreCase("1")|| userChoice.equalsIgnoreCase("add")){
        if(addQ(rand,INPUT)){
            System.out.println("Success\n");}
        }
            else if (userChoice.equalsIgnoreCase("2")|| userChoice.equalsIgnoreCase("simple subtraction")){
                if(simpleSub(rand,INPUT)){
                    System.out.println("Success\n");}
            }
            else if (userChoice.equalsIgnoreCase("3")|| userChoice.equalsIgnoreCase("power of")){
                if(powerOf(rand,INPUT)){
                    System.out.println("Success\n");}
            }
            }
        }


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
}
