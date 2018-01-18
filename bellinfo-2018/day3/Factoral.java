package com.bellinfo.batch8.day3;

import java.util.Scanner;

public class Factoral {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = scan.nextInt();
	int temp = n;
	int factoral = 1;
	int i =1 ;
	for(i=1; i<=temp ; i++){
		factoral = factoral * i;
		
	}
	System.out.println("Factoral is" + factoral);
	}

}
