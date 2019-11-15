package com.swen6301.builder;

import com.swen6301.builder.util.BloodType;
import com.swen6301.builder.util.Sex;

public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int weight;
	private int hight;
	private boolean organDoner;
	private Sex sex;
	private BloodType bloodType;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public boolean getOrganDonerStatus() {
		return organDoner;
	}
	public void setOrganDoner(boolean organDoner) {
		this.organDoner = organDoner;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public BloodType getBloodType() {
		return bloodType;
	}
	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}
	
	public String toString()
	{
		String patientInfo="Name: "+this.getFirstName()+" "+this.getMiddleName()+" "+this.getLastName();
		patientInfo+="\nAge: "+this.getAge();
		patientInfo+="\nWeight: "+this.getWeight();
		patientInfo+="\nHight: "+this.getAge();
		patientInfo+="\nSex: "+this.getSex();
		patientInfo+="\nBlood Type: "+this.getBloodType();
		patientInfo+="\nOrgan Doner Status :"+ this.getOrganDonerStatus();
		
		return patientInfo;
		
	}
	

}
