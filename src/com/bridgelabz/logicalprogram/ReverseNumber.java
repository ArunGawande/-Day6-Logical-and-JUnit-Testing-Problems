package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) {
		
		int remainder, reversedNumber = 0;
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int numberToReverse = scanner.nextInt();
        scanner.close();

        while (numberToReverse > 0) {

            remainder = numberToReverse % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            numberToReverse = numberToReverse / 10;
        }

        System.out.println("The reversed Number is: " + reversedNumber);
    }
	
}
