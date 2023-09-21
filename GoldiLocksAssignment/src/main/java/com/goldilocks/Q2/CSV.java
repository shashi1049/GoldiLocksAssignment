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
	            double sum = 0.0;
	            while ((line = br.readLine()) != null) {
	                
	                String[] values = line.split(",");
	                if (values.length >= 3) {
	                	Integer num1 = Integer.parseInt(values[0]);
	                	Integer num2 = Integer.parseInt(values[1]);
	                	Integer num3 = Integer.parseInt(values[2]);
	                    sum += num1 + num2 + num3;
	                }
	                pw.println(line +", "+ sum);
	            }

	            br.close();
	            pw.close();

	            System.out.println("Content copied " + output);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

}
