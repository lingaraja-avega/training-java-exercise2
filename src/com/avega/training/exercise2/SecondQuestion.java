package com.avega.training.exercise2;

import java.util.Scanner;

public class SecondQuestion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the project ID: ");
		int projectID = Integer.parseInt(sc.nextLine());
		System.out.print("Please enter the project name: ");
		String projectName =  sc.nextLine();
		System.out.print("Please enter the project head: ");
		String projectHead = sc.nextLine();
		System.out.print("Please enter number of resources in project: ");
		int noOfResource = Integer.parseInt(sc.nextLine());
		Project project = new Project(projectID, projectName, projectHead, noOfResource);
		System.out.println(project);
		sc.close();
	}
}
