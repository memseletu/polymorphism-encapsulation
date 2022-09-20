package Petspackage;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("how many pets do ypu have?");
        int petNumber = userInput.nextInt();
        System.out.println("What kind of pet do you have?");
        String petType = userInput.nextLine();
         userInput.nextLine();
         userInput.nextLine();
        userInput.nextLine();
        System.out.println("what is your pets name?");
        String petName= userInput.nextLine();
        userInput.nextLine();
        userInput.nextLine();


    }
}
