package com.swen6301.builder;

import com.swen6301.builder.util.RandomUtils;

public class PatientDirector {
	private GeneralPatientBuilder patientBuilder;
	
	public PatientDirector(GeneralPatientBuilder patientBuilder)
	{
		this.patientBuilder=patientBuilder;
	}
	
	public Patient getPatient()
	{
		return this.patientBuilder.getPatient();
	}
	
	public void build()
	{
		this.patientBuilder.assignFirstName(RandomUtils.randomIdentifier());
		this.patientBuilder.assignMiddleName(RandomUtils.randomIdentifier());
		this.patientBuilder.assignlastName(RandomUtils.randomIdentifier());
		this.patientBuilder.assignAge(RandomUtils.randomNumber(150));
		this.patientBuilder.assignWeight(RandomUtils.randomNumber(400));
		this.patientBuilder.assignHight(RandomUtils.randomNumber(300));
		this.patientBuilder.assignSex(RandomUtils.randomSexString());
		this.patientBuilder.assignBloodType(RandomUtils.randomBloodType());
		this.patientBuilder.assignOrganDoner(RandomUtils.randomBoolean());
	}
	

}
