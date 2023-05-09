package com.avega.training.exercise2;

import java.util.Arrays;
import java.util.Objects;

public class Batch {

	private String startDate;
	private String endDate;
	private Trainee[] trainees;

	public Batch(String startDate, String endDate, Trainee[] trainees) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainees = trainees;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Trainee[] getTrainees() {
		return trainees;
	}

	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}

	public Trainee getTrainee(int traineeId) {
		for (Trainee trainee : trainees) {
			if (trainee.getTraineeId() == traineeId) {
				return trainee;
			}
		}
		return null;
	}

	public Trainee[] getTrainee(String gender) {
		Trainee[] genderBasedTrainee = new Trainee[trainees.length];
		int count = 0;
		for (Trainee trainee : trainees) {
			if (trainee.getGender().equalsIgnoreCase(gender)) {
				genderBasedTrainee[count++] = trainee;
			}
		}
		return genderBasedTrainee;
	}

	@Override
	public String toString() {
		return "Batch [startDate=" + startDate + ", endDate=" + endDate + ", trainees=" + Arrays.toString(trainees)
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(trainees);
		result = prime * result + Objects.hash(endDate, startDate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		return Objects.equals(endDate, other.endDate) && Objects.equals(startDate, other.startDate)
				&& Arrays.equals(trainees, other.trainees);
	}

}
