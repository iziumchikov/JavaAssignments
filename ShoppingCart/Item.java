/*
 * Description: Contains the definition of class named Item that 
 * models an item one would purchase. An item has a name, price, 
 * and quantity.
 * Lab# 7
*/
import java.text.NumberFormat;

public class Item
{
    private String name;	//to hold Item name
    private double price = 0.0; //to hold Price
    private int quantity;	//to hold quantity of items



    // Creates a new item with the given attributes.
    public Item (String itemName, double itemPrice, int numPurchased)
    {
    	name = itemName;
   		price = itemPrice;
   		quantity = numPurchased;
    }


    //   Returns a string with the information about the item
    public String toString ()
    {
    	NumberFormat fmt = NumberFormat.getCurrencyInstance();
    	return name + "\t\t" + "   " + fmt.format(price) + "\t    " + quantity 
 		       + "\t\t" + fmt.format(price * quantity);;
    }


    public double getPrice()
    {
	    return price;
    }

    public void setPrice(double price)
    {
    	this.price = price;
    }

    public String getName()
    {
	   return name;
    }

    public void setName(String name)
    {
    	this.name = name;
    }

    public int getQuantity()
    {
	   return quantity;
    }
    
    public void setQuantity(int quantity)
    {
    	this.quantity = quantity;
    }
}  
