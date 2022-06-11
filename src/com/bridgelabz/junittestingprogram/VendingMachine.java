package com.bridgelabz.junittestingprogram;

import java.util.Scanner;

public class VendingMachine 
{
	// static variable I is declared to change notes and Static variable TOTAL is
	// declared to count total notes
	static int I, TOTAL;

	// Static array to store values of notes
	static int[] NOTES = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	// Function to find the notes and print the output
	static void notes(int value) 
	{
		if (value / NOTES[I] != 0) 
		{
			TOTAL += (value / NOTES[I]);
			System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
			value = value % NOTES[I];
		}
		I++;
		if (value == 0) {
			
			System.out.println("total notes :" + TOTAL);
			return;
		}
		notes(value);
	}

	// main method to test the class
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int value = scanner.nextInt();
		notes(value);
		scanner.close();
	}
}
