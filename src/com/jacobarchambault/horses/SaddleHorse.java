package com.jacobarchambault.horses;

/*
* Program Chapter 17 Lab 3. This class inherits attributes and methods from
* the Horse class
*/
public class SaddleHorse extends Horse {
	private String saddleBreed;
	private String saddleType;

	// constructor
	public SaddleHorse(int anIdNo, String aCoatColor, int anAge, double aHeight, String aSaddleType,
			String aSaddleBreed) {
		super(anIdNo, aCoatColor, anAge, aHeight);
		setSaddleType(aSaddleType);
		setSaddleBreed(aSaddleBreed);
	}

	// get accessor methods
	public String getSaddleBreed() {
		return saddleBreed;
	}

	public String getSaddleType() {
		return saddleType;
	}

	public void setSaddleBreed(String aSaddleBreed) {
		saddleBreed = aSaddleBreed;
	}

	// set mutator methods
	public void setSaddleType(String aSaddleType) {
		saddleType = aSaddleType;
	}
}
