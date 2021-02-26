package mypkg;

import java.util.Scanner;

public class SelControlStructureAss5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose loan type: \n1.Car\n2.House\n3.Business");
		int loantype=sc.nextInt();
		System.out.println("Enter Account number");
		String accountNumber=sc.next();
		if(accountNumber.length()==4&&accountNumber.charAt(0)=='1')
		{	int eligibleAmt=0;
		int eligibleEmi=0;
			System.out.println("Enter Loan Amount Expected");
			int loanAmountExpected=sc.nextInt();
			System.out.println("No. of Installment expected");
			int  noOfInstallmentExpected=sc.nextInt();
			System.out.println("Enter Salary");
			int salary=sc.nextInt();
			
			
			switch(loantype) {
			case 1:	if(salary>25000&&loanAmountExpected<500000&&noOfInstallmentExpected<=36)
				eligibleAmt=500000;eligibleEmi=36;
				break;
			case 2:if(salary>50000&&loanAmountExpected<6000000&&noOfInstallmentExpected<=60)
				eligibleAmt=6000000;eligibleEmi=60;
				break;
				
			case 3:	if(salary>75000&&loanAmountExpected<7500000&&noOfInstallmentExpected<=84)
				eligibleAmt=7500000;eligibleEmi=84;
				break;
			
			}
			
			
			if(eligibleAmt!=0)
			System.out.println("Eligible Amount: "+500000+" Emis: "+36);
			else 
			System.out.println("Cannot Approve loan : Criteria not met");
		}
		
		else System.out.println("invalid account number");
		
	}

}
