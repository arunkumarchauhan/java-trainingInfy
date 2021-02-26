package assi4.staticAss1;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order();// Do not call methods on this object as Members not initialized
		System.out.println(
				"Total No of Orders : " + Order.getTotalNoOfOrders() + "First Order Id : " + order1.getOrderId());
		Order order2 = new Order();
		System.out.println(
				"Total No of Orders : " + Order.getTotalNoOfOrders() + "Second Order Id : " + order2.getOrderId());
		Order order3 = new Order();

		ArrayList<Food> orderedFoods = new ArrayList<Food>();
		orderedFoods.add(new Food("Pasta", 100));
		orderedFoods.add(new Food("Pizza", 200));
		orderedFoods.add(new Food("Biryani", 150));
		orderedFoods.add(new Food("Coffee", 100, 5));

		Order order4 = new Order(orderedFoods);
		System.out.println("\nCash Payment\n");
		System.out.println(order4.toString());
		System.out.println("\n\n Card Payment \n");
		order4.calculateTotalPrice("card");
		System.out.println(order4.toString());
		System.out.println("Total No of Orders : " + order4.getTotalNoOfOrders());

	}

}
