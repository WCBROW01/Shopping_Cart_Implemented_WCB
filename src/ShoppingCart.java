/**
 * A class representing a shopping cart
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class ShoppingCart implements ShoppingCartInterface {
	
	private ArrayBag<Item> bag;
	
	/**
	 * Creates a shopping cart whose initial capacity is 25.
	 */
	public ShoppingCart() {
		bag = new ArrayBag<Item>();
	}
	
	/**
	 * Creates a shopping cart with the specified capacity.
	 * @param desiredCapacity the capacity of the shopping cart
	 */
	public ShoppingCart(int desiredCapacity) {
		bag = new ArrayBag<Item>(desiredCapacity);
	}
	
	@Override
	public int getCurrentSize() {
		return bag.getCurrentSize();
	}

	@Override
	public boolean isEmpty() {
		return bag.isEmpty();
	}

	@Override
	public boolean add(Item newItem) {
		return bag.add(newItem);
	}

	@Override
	public Item remove() {
		return bag.remove();
	}

	@Override
	public boolean remove(Item anItem) {
		return bag.remove(anItem);
	}

	@Override
	public void emptyCart() {
		bag.clear();
	}

	@Override
	public int getAmountOf(Item anItem) {
		return bag.getFrequencyOf(anItem);
	}

	@Override
	public boolean contains(Item anItem) {
		return bag.contains(anItem);
	}
	
	@Override
	public int getTotalPrice() {
		Object[] bagArray = bag.toArray();
		int totalPrice = 0;
		Item tempItem;
		for (int itemIndex = 0; itemIndex < bag.getCurrentSize(); itemIndex++) {
			tempItem = (Item) bagArray[itemIndex];
			totalPrice += tempItem.getPrice();
		}
		
		return totalPrice;
	}

	@Override
	public Item[] toArray() {
		Object[] bagArray = bag.toArray();
		Item[] itemArray = new Item[getCurrentSize()];
		for (int itemIndex = 0; itemIndex < getCurrentSize(); itemIndex++)
			itemArray[itemIndex] = (Item) bagArray[itemIndex];
		
		return itemArray;
	}

}
