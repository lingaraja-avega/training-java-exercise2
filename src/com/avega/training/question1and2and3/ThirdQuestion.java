package com.avega.training.question1and2and3;

public class ThirdQuestion {
	public static void main(String[] args) {
		 Project firstProject = new Project(7316, "LPMS", "Naveen", 6);
		 Project secondProject = new Project(7317, "Chanakya", "Vel", 4);
		 Project thirdProject = new Project(7318, "CPMS", "Lingesh", 7);
		 Project fourthProject = new Project(7319, "Avega", "Kavya", 3);
		 Project fifthProject = new Project(7320, "AvegaInfoTech", "Gokul",5);
		
		Project[] projects = {firstProject, secondProject, thirdProject, fourthProject, fifthProject};
		
		for(Project project: projects) {
			System.out.println(project);
		}
	}
}
