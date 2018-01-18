package com.bellinfo.batch8.day3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	System.out.println("Enter the nuber");
	int num = scan.nextInt();
	int c = num;
	int i;
	int n1 = 0;
	int n2 = 1;
	int n3;
	System.out.println( n1+ " " +n2);
		for(i=2; i < c; i++){
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
		}

	}

}
