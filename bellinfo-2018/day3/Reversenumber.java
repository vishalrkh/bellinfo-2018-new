package com.bellinfo.batch8.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int n = scan.nextInt();
		int temp = 0;
		int reversednumber =0;
		while( n != 0 )
	      {
	          reversednumber = reversednumber * 10;
	          reversednumber = reversednumber + n%10;
	          n = n/10;
	      }
		System.out.println("reversed number is:" + reversednumber);
		
	
		
	}

}
