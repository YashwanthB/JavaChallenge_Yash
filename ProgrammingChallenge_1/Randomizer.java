package com.challenge;



public class Randomizer {

	
	public  int getRandomInteger(int maximum, int minimum){
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 
		}
	public void displayResult(int number, String s ){
		System.out.println("The random Number "+number +"Is "+s); 
		}
	
}


