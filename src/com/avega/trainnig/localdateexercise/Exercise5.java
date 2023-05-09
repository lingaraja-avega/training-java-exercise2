package com.avega.trainnig.localdateexercise;

import java.time.LocalDate;

public class Exercise5 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate cuurentyear = LocalDate.of(currentDate.getYear(), 1, 1);
		System.out.println(cuurentyear);
	}
}
