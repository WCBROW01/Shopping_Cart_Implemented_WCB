/**
 * A class representing an item in a shopping cart
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class Item implements ItemInterface {
	
	private String name;
	private String description;
	private int price;
	private boolean inStock;
	private boolean onSale;
	
	/**
	 * Create an item with no information.
	 */
	public Item() {
		this("", "", 0, false, false);
	}
	
	/**
	 * Create an item with the given information
	 * @param name the name of the item
	 * @param description the description of the item
	 * @param price the price of the item
	 * @param inStock whether the item is in stock
	 * @param onSale whether the item is on sale
	 */
	public Item(String name, String description, int price, boolean inStock, boolean onSale) {
		setName(name);
		setDescription(description);
		setPrice(price);
		setInStock(inStock);
		setOnSale(onSale);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean setName(String newName) {
		name = newName;
		return name == newName;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public boolean setDescription(String newDescription) {
		description = newDescription;
		return description == newDescription;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public boolean setPrice(int newPrice) {
		price = newPrice;
		return price == newPrice;
	}

	@Override
	public boolean isInStock() {
		return inStock;
	}

	@Override
	public boolean setInStock(boolean newInStock) {
		inStock = newInStock;
		return inStock == newInStock;
	}

	@Override
	public boolean isOnSale() {
		return onSale;
	}

	@Override
	public boolean setOnSale(boolean newOnSale) {
		onSale = newOnSale;
		return onSale == newOnSale;
	}
	
	public boolean equals(Item anItem) {
		return this.getName() == anItem.getName() && this.getDescription() == anItem.getDescription() &&
				this.getPrice() == anItem.getPrice() && this.isInStock() == anItem.isInStock() && this.isOnSale() == anItem.isOnSale();
	}
	
	public String toString() {
		// I'm representing this as a string since I want to avoid floating point imprecision.
		String priceInDollars = "$" + Integer.toString(getPrice() / 100) + "." + Integer.toString(getPrice() % 100);
		return "Name: " + getName() + "\n" +
				"Description: " + getDescription() + "\n" +
				"Price: " + priceInDollars + "\n" +
				"In Stock: " + isInStock() + "\n" +
				"On Sale:" + isOnSale();
	}

}
