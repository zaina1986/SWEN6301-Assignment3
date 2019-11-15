package com.swen6301.builder;


import com.swen6301.builder.util.RandomUtils;


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
	public void assignFirstName() {
		// TODO Auto-generated method stub
		this.patient.setFirstName(RandomUtils.randomIdentifier());
		
	}

	@Override
	public void assignMiddleName() {
		// TODO Auto-generated method stub
		this.patient.setMiddleName(RandomUtils.randomIdentifier());
		
	}

	@Override
	public void assignlastName() {
		// TODO Auto-generated method stub
		this.patient.setLastName(RandomUtils.randomIdentifier());
		
	}

	@Override
	public void assignAge() {
		// TODO Auto-generated method stub
		this.patient.setAge(RandomUtils.randomNumber(150));
	}

	@Override
	public void assignWeight() {
		// TODO Auto-generated method stub
		this.patient.setWeight(RandomUtils.randomNumber(400));
	}

	@Override
	public void assignHight() {
		// TODO Auto-generated method stub
		this.patient.setHight(RandomUtils.randomNumber(300));
	}

	@Override
	public void assignSex() {
		// TODO Auto-generated method stub
		this.patient.setSex(RandomUtils.randomSexString());
	}

	@Override
	public void assignBloodType() {
		// TODO Auto-generated method stub
		this.patient.setBloodType(RandomUtils.randomBloodType());
	}

	@Override
	public void assignOrganDoner() {
		// TODO Auto-generated method stub
		this.patient.setOrganDoner(RandomUtils.randomBoolean());
	}

}
