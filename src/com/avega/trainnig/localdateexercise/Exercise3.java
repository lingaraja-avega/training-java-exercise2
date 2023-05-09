package com.avega.trainnig.localdateexercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise3 {
	public static void main(String[] args) {
		
		LocalDate firstDate = LocalDate.of(2022, 1, 5);
		LocalDate secondDate = LocalDate.of(2022, 2, 5);
		
		long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
		System.out.println(daysBetween);
	}

}
