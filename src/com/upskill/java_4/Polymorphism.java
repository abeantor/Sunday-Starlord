package com.upskill.java_4;

public class Polymorphism {
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
     */
	
	// in the interview they call it Compile Time Polymorphism or Static Binding 
	
	public static void main(String [] args) {
		car("Red");
		
		//Method Over Riding - Runtime Polymorphism - Dynamic Binding
		//Same method name from Parent Class to Over Ride 
		Polymorphism obj = new Polymorphism();
		obj.annual_IncomeVoid();
		obj.weekly_IncomeStatic();
		
		
	}
	
	public void annual_IncomeVoid()
	{
		int hourIncome = 40;
		int calculateannual_IncomeVoid = hourIncome * 2000;
		int Rental_Income = 40000;
		int Side_Income = 40000;
		int Second_Job = 120000;
		
		int newIncome = calculateannual_IncomeVoid + Rental_Income + Side_Income + Second_Job;
		
		System.out.println("My Annual Income "+ newIncome);
		
	}
	
	
	public void weekly_IncomeStatic() {
		int hourIncome = 40;
		int calculateannual_IncomeVoid = hourIncome * 8 * 5 ;
		int newIncome = calculateannual_IncomeVoid;
		
		System.out.println("My Weekly Income "+ newIncome);
	}
	
	//Method Over Riding - Runtime Polymorphism - Dynamic Binding
	//Same method name from Parent Class to Over Ride 
	
	
	
	public static void car() {
		System.out.println("My car is Tesla! ");
	}
	
	public static void car(String color) {
		System.out.println("My car is Red " + color);
	}
	
	public static void car(int seat) {
		System.out.println("My car is 7 Seat " + seat);
	}
	
	public static void car(boolean ev) {
		System.out.println("My car is EW Drive "+ ev);
	}
	
	public static void car(String color, int seat) {
		System.out.println("My car is : "+ color + " It has Seat: " + seat);
	}
	
	public static void car(String color, boolean ev, int seat) {
		System.out.println("My car " + color + " but its not 4wd " + ev + " it has 7 seat" + seat );
	}
	
	

}
