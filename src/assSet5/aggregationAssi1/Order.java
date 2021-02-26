package assSet5.aggregationAssi1;

import java.util.ArrayList;

public class Order {
	@Override
	public String toString() {
		String orderedFoodsString = "";
		for (Food food : orderedFoods)
			orderedFoodsString = orderedFoodsString + food.toString();
		return "Order [orderId=" + orderId + "\n OrderedFoods: \n" + orderedFoodsString + ", totalPrice=" + totalPrice
				+ ", status=" + status + "]";
	}

	private long orderId;

	private ArrayList<Food> orderedFoods;
	private double totalPrice;
	private String status;
	private Customer customer;
	static public long orderIdCounter;
	static {
		orderIdCounter = 100;
	}

	public Order() {
	}

	public Order(ArrayList<Food> orderedFoods) {

		this.orderId = ++orderIdCounter;
		this.orderedFoods = orderedFoods;
		this.status = "Placed";
		this.totalPrice = this.calculateTotalPrice("");

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public static int getTotalNoOfOrders() {
		return (int) orderIdCounter - 100;
	}

	public static long getOrderIdCounter() {
		return orderIdCounter;
	}

	public static void setOrderIdCounter(long orderIdCounter) {
		Order.orderIdCounter = orderIdCounter;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public ArrayList<Food> getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(ArrayList<Food> orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

	public double getTotalPrice() {

		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double calculateTotalPrice(String paymentMode) {
		double totalCost = 0;
		for (Food food : orderedFoods)
			totalCost += food.price;
		if (paymentMode.equalsIgnoreCase("card"))
			totalCost -= 40;
		this.totalPrice = totalCost;
		return totalCost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
