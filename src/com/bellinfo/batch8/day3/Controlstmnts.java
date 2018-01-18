package com.bellinfo.batch8.day3;

import java.util.Scanner;

public class Controlstmnts {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = scan.nextInt(); 
		cntrlstmntsif(marks);
		
		
		System.out.println("enter day");
		int day = scan.nextInt();
		cntrlstmntsswitch(day);
		
		System.out.println("Enter number upto");
		
		int max=scan.nextInt();
		
		System.out.println("Enter multiple of");
		int multipleof = scan.nextInt();
		controlstmntsfor(max, multipleof);
		
		int c =20;
		while(c<25){
			System.out.println("C value" + c);
			c++;
		}
		int d=20;
		do{
			System.out.println("C value" + d);
			d++;
		}while(d<25);
	}

	private static void controlstmntsfor(int max, int multipleof) {
		for(int i=1; i<=max;i++){
			int x = multipleof*i;
			System.out.println(x);					 
		}
	}

	private static void cntrlstmntsif(int marks) {
		if(marks >= 90){
			System.out.println("Grade A");
		}else if (marks<=90 && marks>=70){
			System.out.println("Grade B");
		}else if (marks<=70 && marks>=40){
			System.out.println("Grade C");
	}else {
		System.out.println("fail");
	}
	}

	private static void cntrlstmntsswitch(int day) {
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default: System.out.println("Invalid date");
		}
	}
}
