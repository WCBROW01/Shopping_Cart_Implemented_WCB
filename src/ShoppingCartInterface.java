/**
 * An interface that describes a shopping cart
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public interface ShoppingCartInterface {
	
	/**
	 * Gets the current number of items in the cart.
	 * @return the number of items in the cart
	 */
	public int getCurrentSize();
	
	/**
	 * Checks whether the cart is empty.
	 * @return true if the cart is empty, false if not
	 */
	public boolean isEmpty();
	
	/**
	 * Adds the specified item to the cart.
	 * @param newItem The item to add to the cart
	 * @return true if the addition is successful, false if not
	 */
	public boolean add(Item newItem);
	
	/**
	 * Removes an unspecified item from the cart, if possible.
	 * @return either the removed item if the removal was successful, or null
	 */
	public Item remove();
	
	/**
	 * Removes the specified item from the cart, if possible.
	 * @param anItem The item to be removed
	 * @return true if the removal was successful, or false if not
	 */
	public boolean remove(Item anItem);
	
	/**
	 * Removes all items from the cart.
	 */
	public void emptyCart();
	
	/**
	 * Counts the number of times a given item appears in the cart.
	 * @param anItem The item to be counted
	 * @return the number of times anItem appears in the cart
	 */
	public int getAmountOf(Item anItem);
	
	/**
	 * Tests whether the cart contains a particular item.
	 * @param anItem The item to find
	 * @return true if the cart contains anItem, false if not
	 */
	public boolean contains(Item anItem);
	
	/**
	 * Get the total price, in cents, of everything in the cart.
	 * @return the total price, in cents, of everything in the cart
	 */
	public int getTotalPrice();
	
	/**
	 * Retrieves all items in the cart.
	 * @return a new array of all the items in the cart
	 */
	public Item[] toArray();
	
}
