package mypkg;


import java.util.*;
class Tester {

	public static void main(String args[]) {
	
//	Selection control structure assignment 3 		
			
		System.out.println("Enter three numbers");
		Scanner sc=new Scanner(System.in);
		int indexOf7=0;
		int arr[]=new int[3];
		for(int i=0;i<3;i++){
			
		arr[i]=sc.nextInt()	;
		
		if(arr[i]==7)
			indexOf7=i;		
		
		}
		
	
	int sum=0;
	for(int i=indexOf7>0?indexOf7+1:0;i<3;i++) {
		sum+=arr[i];
	}
	if(indexOf7!=2)
	System.out.println("Sum : "+sum);
	else System.out.println("Sum : "+-1);
	
	}}

