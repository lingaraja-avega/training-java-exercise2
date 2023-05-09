package com.avega.trainnig.localdateexercise;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise4 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 5, 9);
		System.out.println(date.with(DayOfWeek.FRIDAY).plusDays(7));
	}
}
