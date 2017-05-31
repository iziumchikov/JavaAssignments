/*
 * Description: Shopping cart implements the shopping cart as an array
 * of Item objects.Creats an new array "cart".If necessary increases
 * size of array by 3 elements. Add item to an array. Count total 
 * price of item in array.
 * Lab# 7
*/
public class ShoopingCart {
	
	private Item[] cart;	//declare a cart array
	private double totalPrice;	//to hold total price
	private int count;		//to count number of item in array
	
	public ShoopingCart()
	{
		cart = new Item[10];	//instantiation of array, which holds 10 items
		totalPrice = 0.0;		//set total price to 0.0
		count = 0;				//set number of items in array to 0
	}
	

	// Increases the capacity of the cart by creating a
	// larger array and copying the existing collection into it.
	public void increaseSize()
	{
		Item[] temp = new Item[cart.length + 3];
		for(int i = 0;i < cart.length;i++)
		{
			temp[i] = cart[i];
			cart = temp;
		}
	}

	// Method addToCart accepts one Item parameter.Count number
	// of items. Increases total price variable.
	public void addToCart(Item item)
	{
		//if statement to check if number of item equals
		//capacity of array, then increase size of array
		if(count == cart.length)
		{
			increaseSize();
		}
		cart[count] = item; //adds item to the cart array
		count++;
		//Multiples price and quantity of current item and 
		// increases totalPrice variable
		totalPrice += (item.getPrice() * item.getQuantity());
	}
	
	//Method roll prints all item in the cart.
	public void printCart()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println(cart[i]);
		}
	}
	

	public double getTotalPrice()
	{
		return totalPrice;
	}
	
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
}
