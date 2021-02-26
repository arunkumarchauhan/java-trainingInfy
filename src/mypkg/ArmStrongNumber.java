package mypkg;
import java.util.*;
public class ArmStrongNumber {

	static boolean isArmStrongNumberStream(int number) {
		String noString=Integer.toString(number);
		int sum=noString.chars().map(d->(int)Math.pow((d-'0'),noString.length())).sum();
		
		return sum==number?true:false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isArmStrongNumberStream(371));
		System.out.println(isArmStrongNumberStream(1634));
	}

}
