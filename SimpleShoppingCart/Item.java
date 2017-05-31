
import java.text.NumberFormat;

public class Item
{
    private String name;
    private double price = 0.0;
    private int quantity;

    //  Create a new item with the given attributes.
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
    	String item;
    	if (name.length() >= 8)
    	{
    		item = name + "\t";
    	}
    	else
    	{
    		item = name + "\t\t";
    	}
	     
	   return (item + "   " + fmt.format(price) + "\t    " + quantity 
		       + "\t\t" + fmt.format(price * quantity));
    }

    public double getPrice()
    {
	    return price;
    }

    public String getName()
    {
	   return name;
    }

    public int getQuantity()
    {
	   return quantity;
    }
}  
