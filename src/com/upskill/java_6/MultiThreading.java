package com.upskill.java_6;

public class MultiThreading {

	/*
	 * 
	 Multithreading is a java feature that allows concurrent execution of two or more parts of a program.
	 Threads can be created by using two mechanisms:
	 1. Extending the thread class
	 2. Implementing the runnable interface 
	 */
	public static void main (String [] args) {
		int n = 10;
		for (int i=0; i < n; i++) {
			MultiThreadingThread obj = new MultiThreadingThread();
			 obj.start();
			 
			 Thread obj2 = new Thread(new MultiThreadingRunable());
			 obj2.start();

		}
	}
	
	
}
