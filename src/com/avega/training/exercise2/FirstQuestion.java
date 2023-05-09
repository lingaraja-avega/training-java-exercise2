package com.avega.training.exercise2;

import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Project project = new Project();
		
		System.out.print("Please enter the project ID: ");
		project.setProjectId(Integer.parseInt(sc.nextLine()));
		System.out.print("Please enter the project name: ");
		project.setProjectName(sc.nextLine());
		System.out.print("Please enter the project head: ");
		project.setProjectHead(sc.nextLine());
		System.out.print("Please enter number of resources in project: ");
		project.setNoOfResources(Integer.parseInt(sc.nextLine()));
		
		
		System.out.println("Project ID is " + project.getProjectId());
		System.out.println("Project Name is "+project.getProjectName());
		System.out.println("Project Head is "+project.getProjectHead());
		System.out.println("Number of resources is " + project.getNoOfResources());
		
		sc.close();

	}

}
