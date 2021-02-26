package mypkg;

import java.util.Scanner;

public class SelectionControlAssi4 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter V- for Veg N -for Nonveg");
		char type=sc.next().charAt(0);
		System.out.println("Enter quantity >0");
		int quantity=sc.nextInt();
		System.out.println("Enter distance >0");
		int distance=sc.nextInt();
		int delieveryCharge=0;
		if(distance>6) {
			delieveryCharge=(distance-6)*2;
			distance=6;
			
		}
		
		if(distance>3) {
			delieveryCharge+=distance-3;
			
		}
			
		
		int totalSum=delieveryCharge+quantity*(type=='V'?12:15);
		System.out.println("Total Sum :"+totalSum);
	}
}
