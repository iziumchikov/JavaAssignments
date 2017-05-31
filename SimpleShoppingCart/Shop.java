
/*
 * Description:Uses the Item class to create items and 
 * add them to a shopping cart stored in an ArrayList.
 * Lab# 5
*/
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Scanner;


public class Shop
{
    public static void main (String[] args)
    {
    	//List of items in cart
    	ArrayList<Item> cart = new ArrayList<Item>();
    	Item item;
    	
    	String itemName;
    	int quantity;
    	double itemPrice;
    	double totalPrice = 0;
    	String keepShopping = "y";
    	Scanner input = new Scanner (System.in);
    	
    	//do-While loop to Continue shopping
    	do {
    		System.out.print("Enter the name of the item: ");
    		itemName = input.nextLine(); 	//input name
    		System.out.print("Enter the unit price: ");
    		itemPrice =input.nextDouble();	//input price. here is a problem. if input is 2,5 with comma everything works great
    										//if input is 2.5 with point, program throws Exception.
    										// I tried many ways, but result is always the same.
    		System.out.print("Enter the quantity: ");
    		quantity = input.nextInt();		//input quantity
            item = new Item(itemName, itemPrice, quantity); //creating an new item and send  name,
            												//price and quantity to method Item of Item class
            cart.add(item);
    		totalPrice += (item.getPrice() * item.getQuantity());	//getting total price using getPrice 
    																	//and getQuantity methods of Item class
    		//prints cart
    		System.out.println("Current cart");
    		for (int i = 0; i < cart.size(); i++)
    		{
    			Item cartIndex = cart.get(i);
    			System.out.println(cartIndex);

    		}
    		System.out.print("Total price is: " + totalPrice + "\n");
    		input.nextLine();
    		System.out.print("\npContinue shopping (y/n)?: ");
    		keepShopping = input.nextLine();
    		
		} while (keepShopping.toLowerCase().charAt(0) == 'y');
    	input.close();
    }
}

