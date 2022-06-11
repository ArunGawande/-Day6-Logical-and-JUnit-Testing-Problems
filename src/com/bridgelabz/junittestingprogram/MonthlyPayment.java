package com.bridgelabz.junittestingprogram;

import java.util.Scanner;

public class MonthlyPayment
{
	 public static void main(String[] args) {

        double P, rate, year;
        
        System.out.println("Enter the Principle amount,Rate and Years");
        
        Scanner scanner = new Scanner(System.in);
        
        P = scanner.nextDouble();
        rate = scanner.nextDouble();
        year = scanner.nextDouble();

        double n = 12 * year;
        double r = rate / (12 * 100);
        double pay = (P * r) / (1 - (Math.pow((1 + r), (-n))));
        
        System.out.println("The payment per month is: Rs " + pay);

    }
}
