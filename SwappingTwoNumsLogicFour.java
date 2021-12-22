package com.dhruv.javaprograms.swappingtwonums;

public class SwappingTwoNumsLogicFour {

	public static void main(String[] args) {
     
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping values are " + a + " " + b);
		
		a = a^b; // bitwise XOR
		b = a^b;
		a = a^b;
		
		System.out.println("After swapping values are " + a + " " + b);
	}

}
