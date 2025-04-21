package com.codes.common;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String inputstring = sc.nextLine();

        String reversedString = new StringBuilder(inputstring).reverse().toString();

        System.out.println("Reversed String is " + reversedString);


    }
}
