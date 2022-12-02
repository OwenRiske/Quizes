package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner INPUT = new Scanner(System.in);
        String[] options = {"1. add", "2. simple subtraction", "3. power of"};
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);

        }
        System.out.print(">");
        String userChoice = INPUT.nextLine();


        while (true) {
            if (userChoice.equalsIgnoreCase("1") || userChoice.equalsIgnoreCase("add")) {
                if (Q.addQ(rand, INPUT)) {
                    System.out.println("Success\n");
                }
            } else if (userChoice.equalsIgnoreCase("2") || userChoice.equalsIgnoreCase("simple subtraction")) {
                if (Q.simpleSub(rand, INPUT)) {
                    System.out.println("Success\n");
                }
            } else if (userChoice.equalsIgnoreCase("3") || userChoice.equalsIgnoreCase("power of")) {
                if (Q.powerOf(rand, INPUT)) {
                    System.out.println("Success\n");
                }
            }

        }
    }

}