package com.bridgelabz.logicalprogram;

import java.util.Iterator;
import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) {
		
	
    int i,sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int number = scanner.nextInt();
    
    for( i = 1; i < number; i++)
    {
    	if(number % i == 0) {
    		sum = sum + i;
    	}
    }
    if(sum == number) {
    	System.out.println("Number is perfect.");
    }else {
    	System.out.println("Number is not perfect.");
    }
    
  }
}
