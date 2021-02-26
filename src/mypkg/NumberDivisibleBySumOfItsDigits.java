package mypkg;

import java.util.Scanner;

public class NumberDivisibleBySumOfItsDigits {
	
	static String checkIfNumberDivisibleByItsDigits(int number) {
		int sum=0;
		int tempNo=number;
		while(tempNo>0) {
			sum+=tempNo%10;
			tempNo/=10;
		}
		
		
		return number%sum==0?" ":" not ";
	}
	static String checkIfNumberDivisibleByItsDigitsStream(int number) {
		return number%Integer.toString(number).chars().map(d->d-'0').sum()==0?" ":" not ";
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(number+" is"+checkIfNumberDivisibleByItsDigits(number)+"divisible by sum of its digit");
		System.out.println(number+" is"+checkIfNumberDivisibleByItsDigitsStream(number)+"divisible by sum of its digit");
		
	}
}
