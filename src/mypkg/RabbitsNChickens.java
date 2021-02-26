package mypkg;

import java.util.Scanner;


//Iteration COntrol Structure Assignment 2
public class RabbitsNChickens {

	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter head count");
	int headCount=sc.nextInt();
	System.out.println("Enter leg count");
	int legCount=sc.nextInt();


int noOfChickens=((4*headCount-legCount)/2);
int noOfRabbits=(legCount-2*headCount)/2;
	
	
	//System.out.println("noOfC "+noOfChickens+" noOfR " +noOfRabbits);
	if(noOfChickens+noOfRabbits==headCount)
		System.out.println("Chickens = "+noOfChickens+"\nRabbits = "+noOfRabbits);
	else System.out.println("The number of chickens and rabbit  cannot be found");
	}
}
