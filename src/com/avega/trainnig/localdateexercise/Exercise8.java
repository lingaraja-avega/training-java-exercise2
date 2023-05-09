package com.avega.trainnig.localdateexercise;

import java.time.LocalDate;

public class Exercise8 {
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2024, 1, 1);
		LocalDate date2 = LocalDate.of(2023, 1, 1);
		
		if(date1.isBefore(date2)) 
			System.out.println(date1 + " is before the " + date2);
		else 
			System.out.println(date1 + " is after the " + date2);
		
	}
}
