package com.avega.trainnig.localdateexercise;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise7 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 5, 9);
		DayOfWeek day = date.getDayOfWeek();
		boolean isWeekEnd = false;
		if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY)
			isWeekEnd = true;
		if (isWeekEnd)
			System.out.println(date + " is a weekend!");
		else
			System.out.println(date + " is not a weekend!");
	}

}
