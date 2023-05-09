package com.avega.training.question10;

public class Main {

	public static void main(String[] args) {
		Trainee[] batchOneTotal = { new Trainee(7316, "Lingesh", 9944519013L, "lingaraja@avegapro.com", "male", 23),
				new Trainee(7317, "Kavya", 704323783L, "kavya@avegapro.com", "female", 26),
				new Trainee(7318, "Gokul", 904311753L, "gokul@avegapro.com", "male", 26) };
		Trainee[] batchTwoTotal = { new Trainee(7319, "Raja", 8043111553L, "raja@avegapro.com", "male", 28),
				new Trainee(7320, "Roja", 907171553L, "roja@avegapro.com", "female", 22) };

		Batch batch1 = new Batch("05-01-2023", "05-03-2023", batchOneTotal);
		Batch batch2 = new Batch("06-03-2023", "06-06-2023", batchTwoTotal);

		System.out.println(batch2.getTrainee(7320));
	
		for (Trainee trainee : batch1.getTrainee("male")) {
			System.out.println(trainee);
		}
	}

}
