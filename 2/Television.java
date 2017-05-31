/*
 * Description: This is Television class for Television demo.
 * It prints main information about TV. turn it on or turn it off,
 * asks user to choose the channel.
 * FileName: Television.java
*/

public class Television {
		//attributes
    private int SCREEN_SIZE;
    private int channel = 2;
    private int volume = 20;
    private String manufacturer;
    private boolean power;
   
   /**
    * The constructor accepts arguments
    * for the television's brand name 
    * and screen size.
    * @param brand receives brand name
    * @param size receives screen size
    */
    public Television (String brand, int size)
    {
    	manufacturer = brand;
    	SCREEN_SIZE = size;  	
    }

    /**
     * The setChannel method will store the 
     * desired station in the channel field.
     * @param station receives number of 
     * channel, which user desire.
     */
    public void setChannel(int station)
    {
    		channel = station;
    }
    
    /**
     * The power method will toggle the power 
     * between on and off, changing the value 
     * stored in the powerOn field from true 
     * to false or from false to true.
     * @param num receives digit "1" to turn
     * on TV and digit "0" to turn off.
     */
    public void power(int num)
    {
    	if (num == 1)
    	{
    		power = true;
    	}
    	else
    	{ 
    		power = false;
    		System.out.println("Your TV has been turned off");
    	}
    }
    
    /**
     * The increaseVolume method will 
     * increase the value stored in 
     * the volume field by 1.
     */
    public void increaseVolume()
    {
    	volume++;
    }
    
    /**
     * The decreaseVolume method will 
     * decrease the value stored in 
     * the volume field by 1.
     */
    public void decreaseVolume()
    {
    	if(volume <= 0)
    	{
    		volume = 0;
    	}
    	else
    	{
    		volume--;
    	}
    }
    
    /**
     * The getChannel method will 
     * return the value stored in 
     * the channel field.
     * @return number of the channel.
     */
    public int getChannel()
    {
    	return channel;
    }

    /**     
     * The getVolume method will 
     * return the value stored 
     * in the volume field.
     * @return volume number.
     */
    public int getVolume()
    {
    	return volume;
    }
    
    /**
     * The getManufacturer method will
     * return the constant value stored
     * in the MANUFACTURER field.
     * @return brand name of TV.
     */
    public String getManufacturer()
    {
    	return manufacturer;
    }
    
    /**
     * The getScreenSize method will 
     * return the constant value stored 
     * in the SCREEN_SIZE field.
     * @return
     */
    public int getScreenSize()
    {
    	 return SCREEN_SIZE;
    }
}