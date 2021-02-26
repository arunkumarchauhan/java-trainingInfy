package mypkg;

public class Factorial {

	static int factorial(int n) {
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	}
	static int iterfactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(7));
		System.out.println(iterfactorial(5));
	}

}
