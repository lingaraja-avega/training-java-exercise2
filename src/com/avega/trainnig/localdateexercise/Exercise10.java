package com.avega.trainnig.localdateexercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise10 {
	public static void main(String[] args) {
		String dateWithString = "2023-05-07";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(dateWithString, formatter);
		System.out.println(date);

	}

}
