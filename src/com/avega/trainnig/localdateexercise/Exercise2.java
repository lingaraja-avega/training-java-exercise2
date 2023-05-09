package com.avega.trainnig.localdateexercise;

import java.time.LocalDate;

public class Exercise2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		int year = today.getYear();
		System.out.println("YEAR: " + year);

		int month = today.getMonthValue();
		System.out.println("MONTH: " + month);

		int day = today.getDayOfMonth();
		System.out.println("DAY: " + day);
	}
}
