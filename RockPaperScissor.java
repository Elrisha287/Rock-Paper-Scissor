package com.company;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        int rock,paper,scissor;
        rock = 0;
        paper = 1;
        scissor = 2;

        System.out.println("Let's play ROCK PAPER SCISSOR\n");

        System.out.print("Enter a number (0 for rock, 1 for paper, 2 for scissor) : ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random rd = new Random();
        int compInput = rd.nextInt(3);

        if(compInput == 0){
            System.out.println("The computer chose rock.");
        }
        else if(compInput == 1){
            System.out.println("The computer chose paper.");
        }
        else if(compInput == 2){
            System.out.println("The computer chose scissor.");
        }

        if(userInput == compInput){
            System.out.println("It's a draw!!!");
        }
        else if(userInput == rock && compInput == scissor || userInput == paper && compInput == rock ||
                userInput == scissor && compInput == paper){
            System.out.println("You win!!!");
        }
        else{
            System.out.println("Computer wins!!!");
        }

    }
}
