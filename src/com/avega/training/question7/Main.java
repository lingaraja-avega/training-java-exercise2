package com.avega.training.question7;

public class Main {

	public static void main(String[] args) {
		Employee[] developersList = { new Employee(7316, "Lingesh", 12000, "Junior Developer"),
				new Employee(7317, "Kavya", 18000, "Junior Developer"),
				new Employee(7318, "Gokul", 20000, "Junior Developer"),
				new Employee(7320, "Vel", 60000, "Senoir Developer"),
				new Employee(7321, "Naveen", 70000, "Senoir Developer"),
				new Employee(7322, "Arun", 80000, "Team Leader") };

		Employee[] trainersList = { new Employee(7319, "Bhavani", 50000, "Technical Trainner") };
		Employee[] adminList = { new Employee(7324, "Pranesh", 40000, "DevOps"),
				new Employee(7325, "Ramesh", 41000, "DevOps") };
		Employee[] testorList = { new Employee(7328, "Ashoka", 40000, "Testing") };
		Employee[] managementList = { new Employee(7331, "Sujuith", 90000, "CEO"),
				new Employee(7323, "Satish", 100000, "MD") };
		Employee[] techList = { new Employee(7326, "Magesh", 15000, "System Manager"),
				new Employee(7327, "Naveen", 16000, "System Manager") };
		Employee[] accountingList = { new Employee(7329, "Madhan", 18000, "Accounting"),
				new Employee(7330, "Praveen", 19000, "Accounting") };

		Department[] departments = { new Department(01, "Developers", developersList),
				new Department(02, "Trainers", trainersList), new Department(03, "Admin", adminList),
				new Department(04, "Mangement", managementList), new Department(05, "Tech", techList),
				new Department(06, "Testor", testorList), new Department(07, "Accounting", accountingList)
		};

		Company avega = new Company("Avega", departments);

//		for (Employee emp : avega.getEmployeesByDept(02)) {
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

//		avega.printDetails();

	}

}
