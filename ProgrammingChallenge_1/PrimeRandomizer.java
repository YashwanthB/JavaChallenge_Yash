package com.challenge;

public class Prime {

	public boolean isPrimeNumber(int number){
		for(int i=2; i<=number/2;i++){
			if(number %i ==0){
				return false;
			}
			}		
		return true;
	}
	public static void main(String args[]){
		Randomizer r=new Randomizer();
		int n = r.getRandomInteger(0, 100);
		Prime p = new Prime();
		boolean b = p.isPrimeNumber(n);
		String s =new String();
		if(b){
			s="Prime";
		}else{
			s="not Prime";
		}
		r.displayResult(n, s);
	}

}
