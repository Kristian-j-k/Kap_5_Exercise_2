package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            // guess random number
            Scanner in = new Scanner(System.in);
            System.out.print("gæt et tal: ");
            int guess;

            guess = in.nextInt(); // gæt 1
            // random number
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            System.out.println("Tilfældigt nummer: "+number);

            if(guess == number) {
                System.out.println("perfekt gæt"); //slut
            }else {
                if (guess > number) {
                    System.out.print("dit gæt er for højt, Prøv igen ");

                } else if (guess < number) {
                    System.out.print("dit gæt er for lavt, Prøv igen ");
                }

            guess = in.nextInt(); //gæt 2
            if (guess == number) {
                  System.out.println("perfekt gæt"); //slut
            } else {
                    if (guess > number) {
                            System.out.print("dit gæt er for højt, Prøv igen ");
                    } else if (guess < number) {
                            System.out.print("dit gæt er for lavt, Prøv igen ");
                    }

            }
                guess = in.nextInt(); //gæt 3
                if (guess == number) {
                    System.out.println("Du har gættet rigtigt"); //slut
                } else {
                    if (guess > number) {
                        System.out.println("dit gæt er for højt, Du har tabt ");
                    } else if (guess < number) {
                        System.out.println("dit gæt er for lavt, Du har tabt ");
                    }

                }
            }
}}
