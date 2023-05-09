package com.avega.training.exercise2;

import java.util.Scanner;

public class Generator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter any sentence: ");
		String sentence = sc.nextLine();
		for (String word : piglatinGenerator(sentence)) {
			System.out.print(word + " ");
		}
		sc.close();
	}

	public static String[] piglatinGenerator(String senetence) {
		String[] wordArray = senetence.toLowerCase().split(" ");
		int count = 0;
		for (String word : wordArray) {
			String revWord = "";
			if (word.length() != 1) {
				char start = ' ';
				for (int i = 0; i < word.length(); i++) {
					if (i == 0)
						start = word.charAt(i);
					else
						revWord += word.charAt(i);
				}
				revWord += start + "a";
			} else {
				revWord += word.charAt(0) + "a";
			}
			wordArray[count++] = revWord;
		}
		return wordArray;
	}
}
