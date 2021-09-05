/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) {
        /*
        1. Prompt user for a quote.
        2. Create a new scanner 'scanner'.
        3. Store user quote as 'quote'.
        4. Prompt user for quote person.
        5. Store quote person as 'quotePerson'.
        6. Print person and quote.
         */
        System.out.print("What is the quote? ");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        System.out.print("Who said it? ");
        String quotePerson = scanner.nextLine();
        System.out.println(quotePerson + " says, " + "\"" + quote + "\"" );
    }
}