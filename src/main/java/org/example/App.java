/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = Integer.parseInt(strIO("What is your age? ", sc));
    String outStr = age >=16 ? (outStr = "You are old enough to legally drive.") : (outStr ="You are not old enough to legally drive.") ;
    System.out.println(outStr);
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}

