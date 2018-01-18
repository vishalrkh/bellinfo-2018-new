package com.bellinfo.batch8.day3;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int digit = 0;
		int count = 0;
		int temp = n;
		int a =0;
		while ( n != 0){
			digit = n % 10;
			n = n / 10;
			count = count + (digit * digit * digit);
			
		}
		if (temp == count){
			System.out.println("number entered is Amstrong");
		}
		else {
			System.out.println("number entered is not amstrong");
		}
				
	}

}
