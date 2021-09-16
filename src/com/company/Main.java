package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {                                             //TODO Godt program helt overordnet, og jeg ved ikke, om mine forslag er noget værd, men here goes.

        public static void main(String[] args) {
            // guess random number
            Scanner in = new Scanner(System.in);
            System.out.print("gæt et tal: ");
            int guess;
                                                                //TODO Overvej om du måske skulle indsætte en "for", der går op til tre ture.
                                                                //TODE På den måde giver du spilleren tre ture, men det hele er i én samling af statements, så du sparer kode på det.
            guess = in.nextInt(); // gæt 1
            // random number
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            System.out.println("Tilfældigt nummer: "+number);

            if(guess == number) {
                System.out.println("perfekt gæt"); //slut
                }else {                                         //TODO Overvej om din "else" og din "if" kan sluttes sammen, så du sparer kode på det.
                if (guess > number) {
                    System.out.print("dit gæt er for højt, Prøv igen ");

                } else if (guess < number) {
                    System.out.print("dit gæt er for lavt, Prøv igen ");
                }

            guess = in.nextInt(); //gæt 2
            if (guess == number) {
                  System.out.println("perfekt gæt"); //slut
            } else {                                            //TODO Også her, tror jeg du kan gøre det i én samling af statements, hvis du bruger et loop. 
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
