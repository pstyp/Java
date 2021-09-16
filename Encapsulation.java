package com.qa.qacommunity;

public class Encapsulation {

	
	 private int passportNumber;
	 private String memorableWord;
	 
	 
	public Encapsulation(int passportNumber, String memorableWord) {
		super();
		this.passportNumber = passportNumber;
		this.memorableWord = memorableWord;
	}


	public Encapsulation() {
		super();
	}


	public int getPassportNumber() {
		return passportNumber;
	}


	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}


	public String getMemorableWord() {
		return memorableWord;
	}


	public void setMemorableWord(String memorableWord) {
		this.memorableWord = memorableWord;
	}


	@Override
	public String toString() {
		return "Encapsulation [passportNumber=" + passportNumber + ", memorableWord=" + memorableWord + "]";
	}
	 
	 
	
	 

	
	
	
	 
}
