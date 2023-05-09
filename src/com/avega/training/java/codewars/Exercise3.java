package com.avega.training.java.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the any word as you like: ");
		StringBuffer word = new StringBuffer(scanner.nextLine().toLowerCase());
		List<String> permutations = new ArrayList<String>();
		
		for(int i = 0; i < word.length(); i++) {
			String mix = Character.toString(word.charAt(i)); 
			for(int j = 0; j < word.length(); j++) {
				if(i != j)
					mix = mix +  Character.toString(word.charAt(j));
			}
			permutations.add(mix);
		}
		System.out.println(permutations);
		scanner.close();
	}
	
}
