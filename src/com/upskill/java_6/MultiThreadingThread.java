package com.upskill.java_6;

public class MultiThreadingThread extends Thread {

	public void run() {
		try {
			System.out.println("Thread number # " +
		Thread.currentThread().getId()+ "is running");
			
			
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}

}
