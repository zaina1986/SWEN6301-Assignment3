package com.swen6301.builder;

import com.swen6301.builder.util.PersistenceUtils;

/**
 * A dummy driver class that simulates a driver class for this project.
 */
public class Driver {
	
	public static void main(String[] args) {
		
		// Create 1000 random samples.
		for(int i = 0; i < 1000; i++) {
			System.out.println("****************");
			createRandomPatient();
			System.out.println("****************");
		}
	}
	
	/**
	 * Creates a sample patient info and store them on internal storage.
	 */
	public static void createRandomPatient() {
		GeneralPatientBuilder patientBuilder=new NormalPatientBuilder();
		// the following attribute may not be all written and the builder must work and create patient
		patientBuilder.assignFirstName();
		patientBuilder.assignMiddleName();
		patientBuilder.assignlastName();
		patientBuilder.assignAge();
		patientBuilder.assignWeight();
		patientBuilder.assignHight();
		patientBuilder.assignSex();
		patientBuilder.assignBloodType();
		patientBuilder.assignOrganDoner();
		PatientDirector patientDirector=new PatientDirector(patientBuilder);
		
		// build() will create the patient and will not store it until it is validated
		// I supposed that Store a patient means printing all his information
		Patient patient=patientDirector.build();
		
		
		
	}
	
}
