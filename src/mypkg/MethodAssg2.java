package mypkg;

import java.util.Scanner;

public class MethodAssg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order=new Order(1,"La Sicila's Pasta ",100,"Ordered");
		
		order.calculateTotalPrice();
		System.out.println(order.toString());
	}

}


class Order{
	private int orderId;
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderedFood=" + orderedFood + ", totalPrice=" + totalPrice
				+ ", status=" + status + "]";
	}

	private String orderedFood;
	private double  totalPrice;
	private String status;
	
	public Order(int orderId, String orderedFood, double totalPrice, String status) {
		this.orderId = orderId;
		this.orderedFood = orderedFood;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	
	public void calculateTotalPrice() {
		this.totalPrice-=0.05*totalPrice;
	}
	
}
