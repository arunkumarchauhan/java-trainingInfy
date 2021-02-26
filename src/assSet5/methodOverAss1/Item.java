package assSet5.methodOverAss1;

public class Item {
	private String brandName;
	private long itemId;
	private String itemType;
	private int size;
	private double price;

	public Item(String brandName, long itemId, String itemType, int size, double price) {
		super();
		this.brandName = brandName;
		this.itemId = itemId;
		this.itemType = itemType;
		this.size = size;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
