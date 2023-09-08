package com.goldilocks.Q5;

import java.util.HashMap;

public class HashMap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();

        // Store sample values
		map.put("Ram", 36);
        
		map.put("Shyam", 60);
		
		map.put("Laxman", 25);
		
		map.put("Bharat", 30);
		
		
		String name = "Ram";
		
		if(map.containsKey(name)) {
			int age = map.get(name);
			System.out.println("Name : "+name +",   " + "Age : "+age);
		}
		else {
			System.out.println("Entry not available with name : "+name);
		}

	}

}
