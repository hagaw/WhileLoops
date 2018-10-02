package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner numberValue = new Scanner(System.in);

        System.out.println("Enter number: ");

        int num, total = 0;
        int count = 1;

        for (int x = 0; x<10; x++) {
            num = numberValue.nextInt();
            total += num;
        }
        System.out.println("Total: " + total);





       /* Scanner kong = new Scanner(System.in);
        System.out.println("Enter anything");
        String userInput = kong.nextLine();


        while (!userInput.equalsIgnoreCase("")) {
            System.out.println("Enter another item");
            userInput = kong.nextLine();
            System.out.println(userInput);
        }*/


      /*  System.out.println("Please enter some value: ");
        String userInput = input.nextLine();

        while(!userInput.equalsIgnoreCase("no")){
            System.out.println("Enter another word");
            userInput = input.nextLine();
            System.out.println("Do you want to quit type the word no." + "To continue press any key. ");
            userInput = input.nextLine();
        }*/
    }
}
