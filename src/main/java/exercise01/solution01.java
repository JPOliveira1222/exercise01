/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package exercise01;

import java.util.Scanner;

public class solution01 {
    /*
        print "What is your name?"
        'name' = read input from user
        print "Hello, 'name', nice to meet you!"
     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + " ,nice to meet you!");

    }


}
