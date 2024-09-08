package com.upskill.java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String studentName;
	int studentAge;
	
	public Constructor(String name) {
		studentName = name;
	}
	public Constructor(int age) {
		studentAge = age;
	}
	public Constructor (String name, int Age) {
		studentName = name;
		studentAge = Age;
	}
	
	public static void main (String [] args) {
		Constructor obj = new Constructor ("Pavel");
		System.out.println(obj.studentName);
		
		Constructor obj2 = new Constructor(25);
		System.out.println(obj2.studentAge);
		
		Constructor obj3 = new Constructor ("Abe", 25);
		System.out.println("My name is "+ obj3.studentName + ". I'm "+ obj3.studentAge + " old.");
		
		
	}

}
