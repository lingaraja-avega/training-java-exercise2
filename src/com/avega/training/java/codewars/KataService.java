package com.avega.training.java.codewars;

import java.util.List;

public interface KataService {
	public StringBuffer replace(String str);

	public StringBuffer charRecognition(String str);

	public int vowelsCount(String str);

	public String squareDigit(String str);

	public int oddNumberTime(List<Integer> list);

	public void sumOfDigit(int number);

	public List<Integer> arrayDiff();

	public String highAndLow(String str);

	public int bitCouting(int nums);

	public String phoneNumberGenerator(List<Integer> list);
	
	public String getMiddle(String str);
	
	public List<Integer> snail();
	
	public String humanReadableTime(int seconds) throws Exception;
	
	public void StringMix();
}
