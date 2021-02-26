package mypkg;
import mypkg.B;
public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer c=new Customer();
c.setDelieveryCharge(5);
System.out.println(Customer.getDelieveryCharge());
Customer c1=new Customer();
c1.setDelieveryCharge(10);
System.out.println(c.getDelieveryCharge());
	
	}

}
abstract class A{
	protected int number=12;
	void disp() {
		System.out.println("Hi A");
	}
	
}


class Customer{
	private String custId;
	private String name;
	
	private	static	float   delieveryCharge;
	public	Customer(){
		System.out.println("In Constructor");
	}
	public Customer(String custId, String name) {
	
		this.custId = custId;
		this.name = name;
	}
	
	public String getCustId() {
		return custId;
	}


	public void setCustId(String custId) {
		this.custId = custId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static float getDelieveryCharge() {
		return delieveryCharge;
	}


	public static void setDelieveryCharge(float delieveryCharge) {
		Customer.delieveryCharge = delieveryCharge;
	}


	
	static {
		System.out.println("In static block");
		
		delieveryCharge=0;
	}
	
	
	
}

