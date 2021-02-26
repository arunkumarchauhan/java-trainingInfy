package mypkg;

public class TraineeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number=10.0f;
		System.out.println("My name is Arunkumar Chauhan.\nMy designation is System Engineer.");
//		System.out.println(number);
		int n=10;
		char marks=(char)n;
		
		int sum=0;
		for(int i=0,j=0;i<5&&j<5;++i,j=i+1)
		{
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("Final "+sum);
	}

}
	