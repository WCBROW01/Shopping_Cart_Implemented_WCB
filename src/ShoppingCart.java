/**
 * A class representing a shopping cart
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class ShoppingCart implements ShoppingCartInterface {
	
	private ArrayBag<Item> shoppingCart;
	
	/**
	 * Creates a shopping cart whose initial capacity is 25.
	 */
	public ShoppingCart() {
		shoppingCart = new ArrayBag<Item>();
	}
	
	/**
	 * Creates a shopping cart with the specified capacity.
	 * @param desiredCapacity the capacity of the shopping cart
	 */
	public ShoppingCart(int desiredCapacity) {
		shoppingCart = new ArrayBag<Item>(desiredCapacity);
	}
	
	@Override
	public int getCurrentSize() {
		return shoppingCart.getCurrentSize();
	}

	@Override
	public boolean isEmpty() {
		return shoppingCart.isEmpty();
	}

	@Override
	public boolean add(Item newItem) {
		return shoppingCart.add(newItem);
	}

	@Override
	public Item remove() {
		return shoppingCart.remove();
	}

	@Override
	public boolean remove(Item anItem) {
		return shoppingCart.remove(anItem);
	}

	@Override
	public void emptyCart() {
		shoppingCart.clear();
	}

	@Override
	public int getAmountOf(Item anItem) {
		return shoppingCart.getFrequencyOf(anItem);
	}

	@Override
	public boolean contains(Item anItem) {
		return shoppingCart.contains(anItem);
	}
	
	@Override
	public int getTotalPrice() {
		Item[] cartArray = shoppingCart.toArray();
		int totalPrice = 0;
		for (int itemIndex = 0; itemIndex < shoppingCart.getCurrentSize(); itemIndex++) {
			totalPrice += cartArray[itemIndex].getPrice();
		}
		
		return totalPrice;
	}

	@Override
	public Item[] toArray() {
		return shoppingCart.toArray();
	}

}
