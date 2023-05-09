package com.avega.training.java.codewars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KataServiceImpl implements KataService {

	@Override
	public StringBuffer replace(String str) {
		StringBuffer word = new StringBuffer(str.toUpperCase());
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
				word.setCharAt(i, '!');
			}
		}
		return word;
	}

	@Override
	public StringBuffer charRecognition(String str) {
		StringBuffer word = new StringBuffer(str.toUpperCase());
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (letter == '5')
				word.setCharAt(i, 'S');
			if (letter == '0')
				word.setCharAt(i, 'O');
			if (letter == '1')
				word.setCharAt(i, 'I');
		}
		return word;
	}

	@Override
	public int vowelsCount(String str) {
		String word = str.trim().toLowerCase();
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				count += 1;
			}
		}
		return count;
	}

	@Override
	public String squareDigit(String str) {
		StringBuffer number = new StringBuffer(str);
		String answer = "";
		for (int i = 0; i < number.length(); i++) {
			String num = Character.toString(number.charAt(i));
			int single = Integer.parseInt(num);
			int square = single * single;
			answer = answer + Integer.toString(square);
		}
		return answer;
	}

	@Override
	public int oddNumberTime(List<Integer> arr) {
		List<Integer> collectionOfNumber = arr;
		List<Integer> withoutDuplicate = new ArrayList<Integer>();
		for (int i = 0; i < collectionOfNumber.size(); i++) {
			if (!withoutDuplicate.contains(collectionOfNumber.get(i))) {
				withoutDuplicate.add(collectionOfNumber.get(i));
			}
		}
		List<Integer> countOfTotal = new ArrayList<Integer>();
		for (int i = 0; i < withoutDuplicate.size(); i++) {
			int count = 0;
			for (int j = 0; j < collectionOfNumber.size(); j++) {
				if (withoutDuplicate.get(i) == collectionOfNumber.get(j)) {
					count += 1;
				}
			}
			countOfTotal.add(count);
		}
		int max = 0;
		int index = 0;
		for (int i = 0; i < countOfTotal.size(); i++) {
			if (max < countOfTotal.get(i) && countOfTotal.get(i) % 2 == 1) {
				max = countOfTotal.get(i);
				index = i;
			}
		}
		return withoutDuplicate.get(index);
	}

	@Override
	public void sumOfDigit(int nums) {
		String number = Integer.toString(nums);
		while (number.length() != 1) {
			int sums = 0;
			for (int i = 0; i < number.length(); i++) {
				String num = Character.toString(number.charAt(i));
				int single = Integer.parseInt(num);
				sums += single;
			}
			number = Integer.toString(sums);
			System.out.println(number);
		}
	}

	@Override
	public List<Integer> arrayDiff() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> listOne = new ArrayList<>();
		List<Integer> listTwo = new ArrayList<>();
		System.out.print("Please enter the list one total length: ");
		int firstLength = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < firstLength; i++) {
			System.out.print("Please enter the " + (i + 1) + " number: ");
			listOne.add(Integer.parseInt(scanner.nextLine()));
		}
		System.out.println("-------------------------------------------------------");
		System.out.print("Please enter the list second total length: ");
		int secondLength = Integer.parseInt(scanner.nextLine());
		System.out.println("For List Two");
		for (int i = 0; i < secondLength; i++) {
			System.out.print("Please enter the " + (i + 1) + " number: ");
			listTwo.add(Integer.parseInt(scanner.nextLine()));
		}
		scanner.close();
		List<Integer> withoutDuplicateListOne = new ArrayList<>();
		List<Integer> answer = withoutDuplicateListOne;

		for (int i = 0; i < listOne.size(); i++) {
			if (!withoutDuplicateListOne.contains(listOne.get(i))) {
				withoutDuplicateListOne.add(listOne.get(i));
			}
		}
		boolean isInside = false;
		for (Integer num1 : listTwo) {
			for (Integer num2 : withoutDuplicateListOne) {
				if (num1 == num2)
					isInside = true;
			}
			if (isInside)
				answer.remove(num1);
		}
		return answer;
	}

	@Override
	public String highAndLow(String str) {
		String numbers = str;
		String[] arrNum = numbers.split(" ");
		int max = 0;
		int min = Integer.parseInt(arrNum[0]);
		for (String num : arrNum) {
			int intNum = Integer.parseInt(num);
			if (max < intNum)
				max = intNum;
			if (min > intNum)
				min = intNum;
		}
		return "" + max + " " + min;
	}

	@Override
	public int bitCouting(int nums) {
		int number = nums;
		List<Integer> binaryNumbers = new ArrayList<>();
		while (number != 0) {
			binaryNumbers.add(number % 2);
			number /= 2;
		}
		int sums = 0;
		for (int num : binaryNumbers) {
			if (num == 1)
				sums += num;
		}
		return sums;
	}

	@Override
	public String phoneNumberGenerator(List<Integer> list) {
		return "(" + list.get(0) + list.get(1) + list.get(2) + ")" + " " + list.get(3) + list.get(4) + list.get(5) + "-"
				+ list.get(6) + list.get(7) + list.get(8) + list.get(9);
	}

	@Override
	public String getMiddle(String str) {
		int length = str.length();
		int div = length / 2;
		if (length % 2 != 0)
			return Character.toString(str.charAt(div));
		else
			return Character.toString(str.charAt(div - 1)) + Character.toString(str.charAt(div));
	}

	@Override
	public List<Integer> snail() {
		int[][] twoArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> answer = new ArrayList<>();
		for (int[] arr : twoArr) {
			for (int num : arr) {
				answer.add(num);
			}
		}
		Collections.sort(answer);
		return answer;
	}

	@Override
	public String humanReadableTime(int seconds) throws Exception {
		if (seconds < 0 || seconds > 359999) {
			throw new Exception("Invalid seconds value");
		}
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		int remainingSeconds = seconds % 60;
		return hours + ":" + minutes + ":" + remainingSeconds;
	}

	@Override
	public void StringMix() {

		String s1 = "my&friend&Paul has heavy hats! &";
		String s2 = "my friend John has many many friends &";

		List<String> countS1 = new ArrayList<>();
		List<String> countS2 = new ArrayList<>();

		List<Character> smallCaseS1 = new ArrayList<>();
		List<Character> smallCaseS2 = new ArrayList<>();

		List<Character> duplS1 = new ArrayList<>();
		List<Character> duplS2 = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++) {
			char letter = s1.charAt(i);
			if (Character.isLowerCase(letter))
				smallCaseS1.add(letter);
			if (Character.isLowerCase(letter) && !duplS1.contains(letter))
				duplS1.add(letter);
		}
		for (int i = 0; i < s2.length(); i++) {
			char letter = s2.charAt(i);
			if (Character.isLowerCase(letter))
				smallCaseS2.add(letter);
			if (Character.isLowerCase(letter) && !duplS2.contains(letter))
				duplS2.add(letter);
		}
		for (char first : duplS1) {
			String alpha = "";
			for (char second : smallCaseS1) {
				if (first == second) {
					alpha += second;
				}
			}
			countS1.add(alpha);
		}
		for (char first : duplS2) {
			String alpha = "";
			for (char second : smallCaseS2) {
				if (first == second) {
					alpha += second;
				}
			}
			countS2.add(alpha);
		}

		for (String letterS1 : countS1) {
			for (String letterS2 : countS2) {
				if (letterS2.toCharArray()[0] == letterS1.toCharArray()[0]) {
					if (letterS1.length() > 0 && letterS2.length() > 0) {
						if (letterS1.length() == letterS2.length())
							System.out.print("=:" + letterS1);
						else if (letterS1.length() > letterS2.length())
							System.out.print("1:" + letterS1);
						else
							System.out.print("2:" + letterS2);
						System.out.print("/");
					}
				}
			}
		}
	}

}
