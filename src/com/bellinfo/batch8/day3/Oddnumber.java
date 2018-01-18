package com.bellinfo.batch8.day3;

public class Oddnumber {

	public static void main(String[] args) {
		int a = 1;
		a = odd();
	}

	private static int odd() {
		int a;
		for(a=1;a<=100;a++){
			if((a -1) % 2 == 0){
				System.out.println("Odd number" + a);
				
			
			}
			else{
				break;
			}
			a = a+1;
	}
		return a;
	}

}
