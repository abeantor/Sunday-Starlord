package com.upskill.java_3;

import java.util.HashMap;

public class Array_Hashmap_Hashnet_HashTable {
	
	public static void main (String [] args) {
		
	
	//Array store multiple data using index
	
	int age =30;
	
	int [] ageStarLord = new int [] {25, 30, 28, 32, 35, 27};
	
	//Array index  [0] [1] [2] [3] [4] [5] 
	
	System.out.println("Student Age " + ageStarLord[2]);
	System.out.println("Total Student : " + ageStarLord.length);
	
	String [] nameStarLord = new String [] {"Ahsan", "Arobi" , "Elena", "Eshana", "Sani", "Pavel"};
	
	System.out.println("Student Name : " + nameStarLord[2]);
	System.out.println("Total Student Name: " + nameStarLord.length);
	
	// for(int i = 0; i<nameStarLord.length; i++) {
	//	System.out.println(nameStarLord[i] + " ");
			
		
	//Multi-Dimentional Array
	int [][] ageStarLord2D = {{25, 30 , 28, 32, 35, 27},
							   {26, 29, 30, 34}};
	System.out.println("Student age 2D : " + ageStarLord2D[0][4]);
	
	// Hashmap Store Multiple data using Key_Value pair, Implementation of map interface 
	
	HashMap<String, Integer> Student = new HashMap<String, Integer>();
	
	Student.put("Ahsan", 26);
	Student.put("Arovi", 21);
	Student.put("Elena", 25);
	Student.put("Eshana", 24);
	Student.put("Sani", 19);
	Student.put("Pavel", 23);
	
	System.out.println("Hash map Student Age: " + Student.get("Arovi"));
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	Capital.put("BD", "Dhaka");
	Capital.put("USA", "Washington");
	
	System.out.println("Capital City : "+ Capital.get("BD"));
	
	//HashTable store multiple data using 
	
	
	

	
	
	
	}
	
	
	

	}


