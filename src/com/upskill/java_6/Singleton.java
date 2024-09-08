package com.upskill.java_6;

public class Singleton {
	
	// singleton is class that can have only one object
	// Private constructor, it prevents any other class from instant 
	
	private Singleton () {
		
	}
	//Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	
	//Getter method 
	public static Singleton getInstance() {
		return SingletonObj;
	}

	protected static void demo() {
		System.out.println("Demo method for singletone class");
	}
}

// This line is to validate the git request