package com.swen6301.builder;

public class NormalPatientBuilder implements GeneralPatientBuilder {
	private Patient patient;
	
	public Patient getPatient()
	{
		return this.patient;
	}
	
	public NormalPatientBuilder()
	{
		this.patient=new Patient();
	}

	@Override
	public void assignFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.patient.setFirstName(firstName);
		
	}

	@Override
	public void assignMiddleName(String middleName) {
		// TODO Auto-generated method stub
		this.patient.setMiddleName(middleName);
		
	}

	@Override
	public void assignlastName(String lastName) {
		// TODO Auto-generated method stub
		this.patient.setLastName(lastName);
		
	}

	@Override
	public void assignAge(int age) {
		// TODO Auto-generated method stub
		this.patient.setAge(age);
	}

	@Override
	public void assignWeight(int weight) {
		// TODO Auto-generated method stub
		this.patient.setWeight(weight);
	}

	@Override
	public void assignHight(int hight) {
		// TODO Auto-generated method stub
		this.patient.setHight(hight);
	}

	@Override
	public void assignSex(Sex sex) {
		// TODO Auto-generated method stub
		this.patient.setSex(sex);
	}

	@Override
	public void assignBloodType(BloodType bloodType) {
		// TODO Auto-generated method stub
		this.patient.setBloodType(bloodType);
	}

	@Override
	public void assignOrganDoner(boolean organDoner) {
		// TODO Auto-generated method stub
		this.patient.setOrganDoner(organDoner);
	}

}
