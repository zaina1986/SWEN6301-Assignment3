package com.swen6301.builder;

import com.swen6301.builder.util.PersistenceUtils;


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
	
	public Patient build()
	{
		Patient patient=getPatient();
		validatePatient(patient);
		return patient;
	}
	
	public void validatePatient(Patient patient)
	{
		boolean success = PersistenceUtils.storePatient(patient);
		if(success) {
			System.out.println("Patient [" + patient.getFirstName() + ", " + patient.getLastName() + "] has been successfully processed!");
			
		} else {
			System.out.println("An error occurred while processing info for patient [" + patient.getFirstName() + ", " + patient.getLastName() + "]!");
		}
	}
	

}
