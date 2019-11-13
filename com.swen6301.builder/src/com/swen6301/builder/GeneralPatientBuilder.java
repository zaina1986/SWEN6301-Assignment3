package com.swen6301.builder;

public interface GeneralPatientBuilder {
	public void assignFirstName(String firstName);
	public void assignMiddleName(String middleName);
	public void assignlastName(String lastName);
	public void assignAge(int age);
	public void assignWeight(int weight);
	public void assignHight(int hight);
	public void assignSex(Sex sex);
	public void assignBloodType(BloodType bloodType);
	public void assignOrganDoner(boolean organDoner);
	public Patient getPatient();

}
