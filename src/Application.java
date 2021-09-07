/**
 * Test application for the shopping cart ADT
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class Application {

	public static void main(String[] args) {
		// Tests on an empty cart
		ShoppingCart aCart = new ShoppingCart();
		testIsEmpty(aCart, true);
		System.out.println();
		
		// Adding items
		System.out.println("Adding 5 items to an initially empty cart:");
		Item iPodClassic = new Item("iPod Classic", "A classic music player with a 160GB HDD", 24900, false, false);
		testAdd(aCart, iPodClassic);
		Item win10Home = new Item("Windows 10 Home", "The latest operating system from Microsoft.", 13900, true, true);
		testAdd(aCart, win10Home);
		Item amdRadeon = new Item("AMD Radeon RX 6800 XT", "A high-end graphics card from AMD.", 64999, false, true);
		testAdd(aCart, amdRadeon);
		Item msIntellimousePro = new Item("Microsoft Pro Intellimouse", "A modern mouse with a classic design.", 5999, true, true);
		testAdd(aCart, msIntellimousePro);
		// Adding a duplicate item
		testAdd(aCart, msIntellimousePro);
		System.out.println();
		
		// Test whether cart is empty again. It should not be.
		testIsEmpty(aCart, false);
		
		// Test getAmountOf
		System.out.println("Testing to see if the duplicate item is found:");
		testGetAmountOf(aCart, msIntellimousePro);
		System.out.println();
		
		// Test contains
		System.out.println("Testing contains method with " + win10Home.getName() + ":");
		testContains(aCart, win10Home);
		
		// Printing the contents of the cart (currently breaks the program)
		//printCartContents(aCart);
		
		// Testing the two remove methods
		System.out.println("Testing the remove method with a parameter:");
		testRemove(aCart, iPodClassic);
		System.out.println("Testing the remove method without a parameter:");
		testRemove(aCart);
		
		// Printing the contents of the cart again (currently breaks the program)
		//printCartContents(aCart);
		
		// Emptying the cart
		System.out.println("Emptying the cart.");
		aCart.emptyCart();
		testIsEmpty(aCart, true);
	}
	
	/**
	 * Tests adding an item to a cart.
	 * @param aCart the cart to add the item to
	 * @param anItem the item to add to the cart
	 */
	private static void testAdd(ShoppingCart aCart, Item anItem) {
		if (aCart.add(anItem))
			System.out.println("Successfully added " + anItem.getName() + " to cart.");
		else
			System.out.println("Error adding " + anItem.getName() + "to cart.");
	}
	
	/**
	 * Tests removing an item from a cart with no parameters
	 * @param aCart the cart to remove an item from
	 */
	private static void testRemove(ShoppingCart aCart) {
		System.out.print("Removing an item from the cart: removed " + aCart.remove().getName());
	}
	
	/**
	 * Tests removing a given item from a cart
	 * @param aCart the cart to remove the item from
	 * @param anItem the item to remove from the cart
	 */
	private static void testRemove(ShoppingCart aCart, Item anItem) {
		System.out.print("Removing " + anItem.getName() + " from the cart: ");
		if (aCart.remove(anItem))
			System.out.println("OK");
		else
			System.out.println("Error");
	}
	
	/**
	 * Tests whether a cart is empty
	 * @param aCart the cart to test
	 * @param correctResult whether the cart should actually be empty
	 */
	private static void testIsEmpty(ShoppingCart aCart, boolean correctResult) {
		System.out.print("Testing isEmpty with ");
		if (correctResult)
			System.out.print("an empty cart: ");
		else
			System.out.print("a non-empty cart: ");
		
		if (aCart.isEmpty() == correctResult)
			System.out.println("OK");
		else
			System.out.println("Error");
	}
	
	/**
	 * Test getting the quantity of a certain item in the cart. 
	 * @param aCart the cart to test
	 * @param anItem the item to test
	 */
	private static void testGetAmountOf(ShoppingCart aCart, Item anItem) {
		System.out.println("There are " + aCart.getAmountOf(anItem) + " " + anItem.getName() + "s in the cart.");
	}
	
	private static void testContains(ShoppingCart aCart, Item anItem) {
		if (aCart.contains(anItem))
			System.out.println("The cart contains " + anItem.getName());
		else
			System.out.println("The cart does not contain " + anItem.getName());
	}
	
	/**
	 * Print out the contents of a cart. (currently broken)
	 * @param aCart the cart to print the contents of
	 */
	private static void printCartContents(ShoppingCart aCart) {
		System.out.println("Current contents of the cart:");
		Item[] cartArray = aCart.toArray();
		for (int itemIndex = 0; itemIndex < cartArray.length; itemIndex++) {
			System.out.print(cartArray[itemIndex].toString() + "\n\n");
		}
		
		String totalPriceInDollars = "$" + Integer.toString(aCart.getTotalPrice() / 100) + "." + Integer.toString(aCart.getTotalPrice() % 100);
		System.out.println("Total price of everything in the cart: " + totalPriceInDollars);
	}

}
