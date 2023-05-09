package com.avega.training.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		
		System.out.println(date);
		System.out.println(yesterday);
		System.out.println(tomorrow);
		
		LocalDate afterThreeWeeks = date.plusWeeks(3);
		LocalDate afterSevenMonths = date.plusWeeks(7);
		LocalDate afterOneYears = date.plusYears(1);
		
		System.out.println(afterThreeWeeks);
		System.out.println(afterSevenMonths);
		System.out.println(afterOneYears);
		
		LocalDate beforeThreeWeeks = date.minusWeeks(3);
		LocalDate beforeSevenMonths = date.minusWeeks(7);
		LocalDate beforeOneYears = date.minusYears(1); 
		
		System.out.println(beforeThreeWeeks);
		System.out.println(beforeSevenMonths);
		System.out.println(beforeOneYears);
		
	    LocalDate isLeapYear = LocalDate.of(2016, 9, 23);
	    System.out.println(isLeapYear.isLeapYear());
	    
	    
	    LocalDate dateWithTime = LocalDate.of(2017, 1, 13);  
	    LocalDateTime datetime = dateWithTime.atTime(1,50,9);  
	    System.out.println(datetime);
		
	}

}
