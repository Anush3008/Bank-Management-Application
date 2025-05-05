package com.internshala.advancedjava;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int age = 11;
			//validate age
			validateAge(age);
			System.out.print("Age is valid. You can access the website");
		}
		
		catch (AgeTooYoungException e) {
			
			System.out.print("Exception caught : "+e.getMessage());
		}
	}
	
	//defining a  function
	
	public static void validateAge(int age) throws AgeTooYoungException {
		
		// if age  <= 15 throw exception
		if (age<=15) {
			
			throw new AgeTooYoungException("Age is too less. Must be greater than 15 to access the website.");
		}
		
	
		
	}

}
