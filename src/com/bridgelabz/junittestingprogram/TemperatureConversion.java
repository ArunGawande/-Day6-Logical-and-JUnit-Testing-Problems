package com.bridgelabz.junittestingprogram;

import java.util.Random;
import java.util.Scanner;

public class TemperatureConversion 
{
	public static void main(String[] args) {

		Random random = new Random();
		int choose = random.nextInt(2) + 1;
		System.out.println("Random Choose for 1 is Fahrenheit to Celsius and 2 is Celsius to Fahrenheit:\n " + choose);
		Scanner scanner = new Scanner(System.in);

		if (choose == 1) {
			System.out.println("Enter the temp in Fahrenheit:");
			int fahrenheit = scanner.nextInt();
			int celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("The temp in Celsius is :" + celsius);
		} else if (choose == 2) {
			System.out.println("Enter the temp in Celsius:");
			int celsius = scanner.nextInt();
			int fahrenheit = (celsius * 9 / 5) + 32;
			System.out.println("The temp in Fahrenheit is :" + fahrenheit);
		} else {
			System.out.println("Please Choose from above two choices");
		}
	}
}
