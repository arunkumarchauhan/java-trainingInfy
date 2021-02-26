package assSet5.methodOverAss1;

public class Bill {
	private Item[] items = { new Item("Puma", 1001, "T-shirt", 34, 25), new Item("Puma", 1001, "T-shirt", 36, 25),
			new Item("Puma", 1002, "Skirt", 38, 20), new Item("Puma", 1002, "Skirt", 40, 20),
			new Item("Reebok", 1003, "T-shirt", 34, 23), new Item("Reebok", 1003, "T-shirt", 36, 23),
			new Item("Reebok", 1004, "Skirt", 38, 18), new Item("Reebok", 1004, "Skirt", 40, 18),

	};

	double findPrice(long itemId) {
		for (Item item : items)
			if (item.getItemId() == itemId)
				return item.getPrice();
		return 0;
	}

	double findPrice(String brandName, String itemType, int size) {
		for (Item item : items)
			if (item.getItemType().equals(itemType) && item.getBrandName().equals(brandName) && item.getSize() == size)
				return item.getPrice();
		return 0;
	}
}
