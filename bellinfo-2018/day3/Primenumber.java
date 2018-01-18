package com.bellinfo.batch8.day3;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		if( (n % 2) == 0 || (n % 3) == 0 || (n % 5) == 0 || (n % 7) == 0 || (n % 11) == 0 || (n % 13 == 0) || (n % 17) == 0 || (n % 19) == 0 || (n % 23) == 0 || (n % 29) ==0 ){
			System.out.println("Number not prime");
		}
		else{
			System.out.println("Prime number" + n);
		}
	}

}