package com.company;
//kap3 Exercise 4
import java.util.Random;
import java.util.Scanner;

public class GuessStarter {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gues;

        //henter eller scanner dit gæt

        System.out.print("gæt et nummer: ");
        gues = in.nextDouble();

        //genererer random nummer
        Random random = new Random();
        int number = random.nextInt(100)+1; //definerer tilfældigt nummer
        System.out.print("dit gæt: ");
        System.out.println(gues);   //print your input
        System.out.print("Tilfældigt nummer: ");
        System.out.println(number); //print random number

        //regner forskellen
        System.out.print("Du ramte så meget ved siden af: ");
        System.out.println(number-gues);


    }
}