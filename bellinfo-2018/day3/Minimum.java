package com.bellinfo.batch8.day3;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int no1 = scan.nextInt(); 
		System.out.println("Enter the second number:");
		int no2 = scan.nextInt();
		System.out.println("Enter the third number:");
		int no3 = scan.nextInt();
		System.out.println("Enter the fourth number:");
		int no4 = scan.nextInt();

		leastnumber(no1, no2, no3, no4);

	
}

	private static void leastnumber(int no1, int no2, int no3, int no4) {
		if(no1<no2 && no1<no3 && no1<no4){
			System.out.println("Number 1 is the least i.e." + no1);
		}
		else if(no2<no1 && no2<no3 && no2<no4){
			System.out.println("Number 2 is the least i.e" + no2);
		}
		else if(no3<no1 && no3<no2 && no3<no4){
			System.out.println("Number 3 is the least i.e" + no3);
		}
		else if(no4<no1 && no4<no2 && no4<no3){
			System.out.println("Number 4 is the least i.e" + no4);
		}
		else if(no1 == no2 || no1 == no3 || no1 == no4 || no2 == no3 || no2==no4 || no3 == no4    ){
			System.out.println("same 2 numbers entered");
			if (no1 < no3 && no1 < no4){
				System.out.println("Number 1 and Number 2 are the same and the least number is" + no1);
			}
			else if(no1 < no2 && no1 < no4){
				System.out.println("Number 1 and Number 3 are the same and the least number is" + no1);
			}
			else if(no1 < no2 && no1 < no3){
				System.out.println("Number 1 and Number 4 are the same and the least number is" + no1);
			}
			else if(no2 < no1 && no2 < no4){
				System.out.println("Number 2 and Number 3 are the same and the least number is" + no2);
			}
			else if(no2 < no1 && no2 < no3){
				System.out.println("Number 2 and Number 4 are the same and the least number is" + no2);
			}
			else if(no3 < no1 && no3 < no2){
				System.out.println("Number 3 and Number 4 are the same and the least number is" + no3);
			}
			else{
				System.out.println("three same numbers are entered");
				if(no1 == no2 && no2 == no3 && no1 < no4){
				System.out.println(" Number 1, Number 2 and Number 3 are the least and the number is" + no1);
				}
				else if(no1 == no2 && no2 == no4 && no1 < no3){
				System.out.println(" Number 1, Number 2 and Number 4 are the least and the number is" + no1);
				}
				else if(no1 == no3 && no1 == no4 && no1 < no2){
				System.out.println(" Number 1, Number 3 and Number 4 are the least and the number is" + no1);
				}
				else if(no2 == no1 && no2 == no3 && no2 < no4){
				System.out.println(" Number 1, Number 2 and Number 3 are the least and the number is" + no2);
				}
				else if(no2 == no1 && no2 == no4 && no2 < no3){
				System.out.println(" Number 1, Number 2 and Number 4 are the least and the number is" + no2);
				}
				else if(no2 == no3 && no2 == no4 && no2 < no1){
				System.out.println(" Number 2, Number 3 and Number 4 are the least and the number is" + no2);
				}
				else if(no3 == no1 && no2 == no3 && no3 < no4){
				System.out.println(" Number 1, Number 2 and Number 3 are the least and the number is" + no3);
				}
				else if(no3 == no1 && no3 == no4 && no3 < no2){
				System.out.println(" Number 1, Number 3 and Number 4 are the least and the number is" + no3);
				}
				else if(no3 == no2 && no3 == no4 && no3 < no1){
				System.out.println(" Number 2, Number 3 and Number 4 are the least and the number is" + no3);
				}
				else{
					System.out.println("all numbers are the same ");
				}
				
		}
		
		
		
	}
	}
}