package com.avega.trainnig.localdateexercise;

import java.time.LocalDate;

public class Exercise6 {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate lastDayOfMonth = LocalDate.of(currentDate.getYear(), currentDate.getMonthValue(),
				currentDate.lengthOfMonth());
		System.out.println(lastDayOfMonth);
	}

}
