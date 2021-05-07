package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        int User_Input;

        Random random = new Random();
        int Secret_Number = random.nextInt(50);
        System.out.println("Guess the number from 1 to 50: ");

        Scanner scanner = new Scanner(System.in);

        User_Input = scanner.nextInt();

        while (User_Input != Secret_Number) {
            if(User_Input <= Secret_Number) {
                System.out.println("You need to guess highest number.Try Again");
            }
            else{
                System.out.println("You need to guess lowest number.Try Again");
            }
            User_Input = scanner.nextInt();
        }
        System.out.println("You guessed correctly!");
    }
}

