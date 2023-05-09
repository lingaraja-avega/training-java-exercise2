package com.avega.training.question1and2and3;

public class ThirdQuestion {
	public static void main(String[] args) {

		Project[] projects = { new Project(7316, "LPMS", "Naveen", 6), new Project(7317, "Chanakya", "Vel", 4),
				new Project(7318, "CPMS", "Lingesh", 7), new Project(7319, "Avega", "Kavya", 3),
				new Project(7320, "AvegaInfoTech", "Gokul", 5)
		};

		for (Project project : projects) {
			System.out.println(project);
		}
	}
}
