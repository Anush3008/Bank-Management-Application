package com.internshala.advancedjava;

public class CheckedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class temp = Class.forName("Class2");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class dos not exist. Check the name of the class");
			
		}
	}

}
