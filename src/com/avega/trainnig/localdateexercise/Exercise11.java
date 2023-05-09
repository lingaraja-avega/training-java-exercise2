package com.avega.trainnig.localdateexercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise11 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 5, 7);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateString = date.format(formatter);
		System.out.println(dateString);
	}
}
