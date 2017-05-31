/*
 * Description:Shopping class using the Item class to create items
 * ,and add them to a shopping cart array using ShoopingCart. 
 * After prints all info about items in cart.
 * Lab# 7
*/

import java.util.Scanner;

public class shopping
{
    public static void main (String[] args)
    {	
    	int quantity;	//to hold users input of quantity
    	double itemPrice;	//to hold users input of price
    	String itemName;	//to hold users input of name
    	Item item;		//creates object of Item class
    	//creates a new shopping cart
		ShoopingCart cart = new ShoopingCart();
    
    	Scanner input = new Scanner (System.in);
    	
    	System.out.println("Wlecome to Shopper's paradise");
    	System.out.print("Enter the name of the first item: ");
    		itemName = input.nextLine();	//input name
    	//do-While loop to Continue shopping	
    	do{
    		System.out.print("Enter the quantity: ");
    			quantity = input.nextInt();	//input quantity
    		System.out.print("Enter the unit price: ");
    			itemPrice = input.nextDouble();	//input price
    			
    		//creating new item 
            item = new Item(itemName, itemPrice, quantity);
            //adding an item to the cart by addToCart method
            cart.addToCart(item);	
            
            input.nextLine();	//Discard newline
            //Asks user to continue or not
    		System.out.print("\nEnter the name of the next Item or Q to quit: ");
    		itemName = input.nextLine();
    	}while(!itemName.equalsIgnoreCase("q"));	//end of do-while loop
    	
    	//this block prints info about all items in array
		System.out.println("Shooping cart");
		System.out.println("Item" + "\t\tUnit price" + "\tQuantity" + "\tTotal");
		cart.printCart();
		System.out.print("Total price: $" + cart.getTotalPrice() + "\n");
		System.out.print("Please pay... $" + cart.getTotalPrice() + "\n");
		input.close();
    }
}

