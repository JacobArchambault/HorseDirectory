package com.jacobarchambault.horses;

/*
* Superclass of different types of horses.
*/
public class Horse {
	private int age;
	private String coatColor;
	private double height;
	// attributes
	private int idNo;

	// constructor
	public Horse(int anIdNo, String aCoatColor, int anAge, double aHeight) {
		setIdNo(anIdNo);
		setCoatColor(aCoatColor);
		setAge(anAge);
		setHeight(aHeight);
	}

	// get accessor methods
	public int getAge() {
		return age;
	}

	public String getCoatColor() {
		return coatColor;
	}

	public double getHeight() {
		return height;
	}

	public int getIdNo() {
		return idNo;
	}

	public void setAge(int anAge) {
		age = anAge;
	}

	public void setCoatColor(String aCoatColor) {
		coatColor = aCoatColor;
	}

	public void setHeight(double aHeight) {
		height = aHeight;
	}

	// set mutator methods alternating the values of variables
	public void setIdNo(int anIdNo) {
		idNo = anIdNo;
	}
}
