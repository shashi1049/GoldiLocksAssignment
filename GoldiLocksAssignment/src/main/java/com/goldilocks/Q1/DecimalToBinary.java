package com.goldilocks.Q1;

public class DecimalToBinary {
	public static void main(String[] args) {
		String decimal = "10";
		String binary = toBinary(decimal);
		
		System.out.println("Binary form : " +binary );
	}

	private static String toBinary(String decimal) {
		// TODO Auto-generated method stub
		int decNum = Integer.parseInt(decimal);
		StringBuilder bin = new StringBuilder();
		
		while(decNum > 0) {
			
			int rem = decNum % 2;
			bin.append(rem);
			decNum /= 2;	
		}
		
		return bin.reverse().toString();
	}

}
