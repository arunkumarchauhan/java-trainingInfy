package mypkg;

import java.util.Scanner;

public class PalindromeNumber {
	
	static boolean checkPalindrome(long number) {
		//int  digits[]=Long.toString(number).chars().map(d->d-'0').toArray();
		char digits[]=Long.toString(number).toCharArray();//.chars().map(d->d-'0').toArray();
		int i=0,j=digits.length-1;
		
		for(char d:digits)
			System.out.println(d);
		boolean isPalindrome=true;
		while(i<j) {
			if(digits[i++]!=digits[j--]) {
				isPalindrome=false;
				break;
			}
		}
		
		return isPalindrome;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long number=sc.nextLong();
		System.out.println(checkPalindrome(number));
		
	}

}
