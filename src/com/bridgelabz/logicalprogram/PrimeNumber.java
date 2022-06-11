package com.bridgelabz.logicalprogram;

import java.util.Scanner;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class PrimeNumber {
	
	public static void main(String[] args) {

		int i, number = 0, flag = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n = scanner.nextInt();
		
		number = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("Number is not prime number.");
		} else {
			for (i = 2; i <= number; i++) {
				if (n % i == 0) {
					System.out.println("Number is not prime number.");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Number is prime number.");
			}
		}
	}
}
