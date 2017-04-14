package com.challenge;

import java.util.Scanner;

public class StringReverseDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string to reverse");		
		
		try{
			Scanner userInputScanner = new Scanner(System.in);
			String inputStr = userInputScanner.nextLine();
			char[] charArray = inputStr.toCharArray();
			int arralyLenght = charArray.length;
			for(int i=arralyLenght-1; i>=0; i--){
				System.out.print(charArray[i]);
			}
			userInputScanner.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
