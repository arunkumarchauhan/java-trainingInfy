package mypkg;
import java.util.*;

public class SelectionControlStructureAss2 {

	//find roots of  quadratic equation
	// ax2+bx+c=0
	//discriminant=b2-4ac
	//if discriminat d=0; root1=root2
	//if d>0 ,unequal and real roots
	//if d<0, no real roots display no real roots
	//root=(-b+||-d)/(2a)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter coefficients a b c ");
		int a=0,b=0,c=0;
		float root1,root2;
		int d=0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		d=(b*b)-(4*a*c);
		
		root1=(-b+d)/(2*a);
		root2=(-b-d)/(2*a);
		if(d==0) {
			System.out.println("Equal Real roots, root1 :"+root1+" root2: "+root2);
			
		}
		else if(d>0)
			System.out.println("Unequal real  roots, root1 :"+root1+" root2: "+root2);
		else if(d<0)
		System.out.println("no real roots ");
		
		
		
	}

}
