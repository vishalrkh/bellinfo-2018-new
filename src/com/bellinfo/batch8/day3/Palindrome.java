package com.bellinfo.batch8.day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome");
		int n = scan.nextInt();
		int temp = n;
		int reversednumber =0;
		
		while( n != 0 )
	      {
	          reversednumber = reversednumber * 10;
	          reversednumber = reversednumber + n%10;
	          n = n/10;
	      }
		if (reversednumber == temp){
			System.out.println("It is a palindrome");
			
		}
		else{
			System.out.println("not a palindrome");
		}
	     

	}

}
