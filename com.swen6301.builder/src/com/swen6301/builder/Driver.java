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
		GeneralPatientBuilder normalPatientBuilder=new NormalPatientBuilder();
		PatientDirector patientDirector=new PatientDirector(normalPatientBuilder);
		patientDirector.build();
		Patient patient=patientDirector.getPatient();
		
		
		boolean success = PersistenceUtils.storePatient(patient);
		if(success) {
			System.out.println("Patient [" + patient.getFirstName() + ", " + patient.getLastName() + "] has been successfully processed!");
			System.out.println(patient.toString());
		} else {
			System.out.println("An error occurred while processing info for patient [" + patient.getFirstName() + ", " + patient.getLastName() + "]!");
		}
	}
	
}
