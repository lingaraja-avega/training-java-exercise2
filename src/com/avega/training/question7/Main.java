package com.avega.training.question7;

public class Main {

	public static void main(String[] args) {

		Employee firstEmployee = new Employee(7316, "Lingesh", 12000, "Junior Developer");
		Employee secondEmployee = new Employee(7317, "Kavya", 18000, "Junior Developer");
		Employee thirdEmployee = new Employee(7318, "Gokul", 20000, "Junior Developer");
		Employee fourthEmployee = new Employee(7319, "Bhavani", 50000, "Technical Trainner");
		Employee fifthEmployee = new Employee(7320, "Vel", 60000, "Senoir Developer");
		Employee sixthEmployee = new Employee(7321, "Naveen", 70000, "Senoir Developer");
		Employee seventhEmployee = new Employee(7322, "Arun", 80000, "Team Leader");
		Employee eightEmployee = new Employee(7323, "Satish", 100000, "MD");	
		Employee ninthEmployee = new Employee(7324, "Pranesh", 40000, "DevOps");
		Employee tenthEmployee = new Employee(7325, "Ramesh", 41000, "DevOps");
		Employee elevthEmployee = new Employee(7326, "Magesh", 15000, "System Manager");
		Employee twethEmployee = new Employee(7327, "Naveen", 16000, "System Manager");
		Employee thirteenEmployee = new Employee(7328, "Ashoka", 40000, "Testing");
		Employee fourteenEmployee = new Employee(7329, "Madhan", 18000, "Accounting");
		Employee fifteenEmployee = new Employee(7330, "Praveen", 19000, "Accounting");
		Employee sixteenEmployee = new Employee(7331, "Sujuith", 90000, "CEO");
		
		Employee[] developers = {firstEmployee, secondEmployee, thirdEmployee, fifthEmployee, sixthEmployee, seventhEmployee}; 
		Employee[] trainers = {fourthEmployee};
		Employee[] admin = {ninthEmployee, tenthEmployee};
		Employee[] testor = {thirteenEmployee};
		Employee[] management = {eightEmployee, sixteenEmployee};
		Employee[] tech = {elevthEmployee, twethEmployee};
		Employee[] accounting = {fourteenEmployee, fifteenEmployee};
		
		Department firstDept = new Department(01, "Developers", developers);
		Department secondDept = new Department(02, "Trainers", trainers);
		Department thirdDept = new Department(03, "Admin", admin);
		Department fourthDept = new Department(04, "Mangement", management);
		Department fifthDept = new Department(05, "Tech", tech);
		Department sixthDept = new Department(06, "Testor", testor);
		Department seventhDept = new Department(07, "Accounting", accounting);
		
		Department[] departments = {firstDept, secondDept, thirdDept, fourthDept, fifthDept, sixthDept, seventhDept};
		
		Company avega = new Company("Avega", departments);
		
//		for(Employee emp : avega.getEmployeesByDept(02)) {
//			System.out.println(emp);
//		}
		
//		for(Employee emp : avega.getEmployeesByDesignation("DevOps")) {
//			if(emp != null)
//				System.out.println(emp);
//		}
		
//		for(Employee emp : avega.getEmployeesBySalary(18000)) {
//			if(emp != null)
//				System.out.println(emp);
//		}
		
		avega.printDetails();
		

	}

}
