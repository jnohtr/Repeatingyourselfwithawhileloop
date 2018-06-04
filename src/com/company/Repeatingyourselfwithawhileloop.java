package com.company;

import java.util.Scanner;
public class Repeatingyourselfwithawhileloop {

    public static void main(String[] args) {
	// write your code here
        /*// TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0
        int i = 1;
        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();


        while ( guess != secretNumber )
            while (i < 5)
            {
                System.out.println("\nYou are wrong. Try again.");
                System.out.println("Enter the number: ");
                guess = keyboard.nextInt();
                i++;
                break;
            }


        System.out.println("You are correct. You win a prize!");
        keyboard.close();*/

        //Repeating yourself with a while loop2
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0

        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        int guessNumber =1 ; //0 m1,1

        while ( guess != secretNumber && guessNumber <5) // ||<2
        {
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();

            guessNumber ++;

        }

        if(guess == secretNumber){
            System.out.println("You are correct. You win a prize!");
            keyboard.close();}
        else
            System.out.print("5 tries, try again 5min later , bye for now");
    }
}
