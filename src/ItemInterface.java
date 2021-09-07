/**
 * An interface that describes an item in a shopping cart
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public interface ItemInterface {
	/**
	 * Gets the name of the item
	 * @return the name of the item
	 */
	public String getName();
	
	/**
	 * Sets the name of the item
	 * @param newName the new name of the item
	 * @return true if the name was set successfully, false if not
	 */
	public boolean setName(String newName);
	
	/**
	 * Gets the description of the item
	 * @return the description of the item
	 */
	public String getDescription();
	
	/**
	 * Sets the description of the item
	 * @param newDescription the new description of the item
	 * @return true if the description was set successfully, false if not
	 */
	public boolean setDescription(String newDescription);
	
	/**
	 * Gets the price of the item in cents
	 * @return the price of the item in cents
	 */
	public int getPrice();
	
	/**
	 * Sets the price of the item in cents
	 * @param newPrice the new price of the item in cents
	 * @return true if the price was set successfully, false if not
	 */
	public boolean setPrice(int newPrice);
	
	/**
	 * Checks whether the item is in stock
	 * @return true if the item is in stock, false if not
	 */
	public boolean isInStock();
	
	/**
	 * Sets whether the item is in stock
	 * @param newInStock The new status of whether the item is in stock
	 * @return True if the stock status was set successfully, false if not
	 */
	public boolean setInStock(boolean newInStock);
	
	/**
	 * Checks whether the item is on sale
	 * @return True if the item is on sale, false if not
	 */
	public boolean isOnSale();
	
	/**
	 * Sets whether the item is on sale
	 * @param newOnSale the new status of whether the item is on sale
	 * @return true if the sale status was set successfully, false if not
	 */
	public boolean setOnSale(boolean newOnSale);
	
}
