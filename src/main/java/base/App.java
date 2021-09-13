/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input
        System.out.print("What is the password? ");
        String input = in.nextLine();

        //welcome output if input is the password
        if (input.contains("abc$123")) {
            System.out.println("Welcome.");
        }
        //if password doesn't match output
        else {
            System.out.println("I don't know you.");
        }
    }
}
