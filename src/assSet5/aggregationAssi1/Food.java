package assSet5.aggregationAssi1;

public class Food {
	public String name;
	public double price;
	public int quantity;

	@Override
	public String toString() {
		return "\nFood [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public Food(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Food(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}
}
