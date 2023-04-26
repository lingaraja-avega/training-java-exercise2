package com.avega.training.question9;

public class SentenceMaker {

	public static void main(String[] args) {
		String sentence = "Hai you are how";
		String[] wordArray = sentence.split(" ");
		String temp = wordArray[1];
		wordArray[1] = wordArray[3];
		wordArray[3] = temp;
		for (String word : wordArray) {
			System.out.print(word + " ");
		}
	}
}
