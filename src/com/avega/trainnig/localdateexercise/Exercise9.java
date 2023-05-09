package com.avega.trainnig.localdateexercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise9 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2023, 5, 5);
		LocalDate date2 = LocalDate.of(2023, 7, 6);
		System.out.println(ChronoUnit.MONTHS.between(date1.withDayOfMonth(1), date2.withDayOfMonth(1)));
	}

}
