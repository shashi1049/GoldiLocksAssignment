package com.goldilocks.Q7;

public class CommandLineInput {
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("No args");
		}
		else {
			for(String s : args) {
				System.out.println(s);
			}
		}
	}

}
// Give argument from run configuration.