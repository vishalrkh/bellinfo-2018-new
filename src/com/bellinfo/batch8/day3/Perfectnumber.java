package com.bellinfo.batch8.day3;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int n = scan.nextInt();
	int temp = n;
	int i;
	int sum =0;
	for(i=1; i < n; i++){
		if(n % i == 0){
			sum = sum +i;
		}
	}
	
	if(temp == sum){
		System.out.println("Number entered is a perfect number");
	}
	else{
		System.out.println("It is not a perfect number");
	}
	

	}

}
