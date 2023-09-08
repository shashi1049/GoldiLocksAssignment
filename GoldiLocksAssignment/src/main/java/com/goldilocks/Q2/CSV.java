package com.goldilocks.Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;

public class CSV {
	
	public static void main(String[] args) {
	      String input = "D:\\csv\\input.csv";
	        String output = "D:\\csv\\output.csv";


	        try {
	            BufferedReader br = new BufferedReader(new FileReader(input));
	            PrintWriter pw = new PrintWriter(new FileWriter(output));

	            String line;
	            while ((line = br.readLine()) != null) {
	                pw.println(line);
	            }

	            br.close();
	            pw.close();

	            System.out.println("Content copied " + output);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

}
