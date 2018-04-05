// The purpose of this class is to model a television.
// Dylan Bobb 1/24/2018

package television;

public class Television
{
    // Attributes:

    // Shows the manufacturer of the television.
    private String MANUFACTURER;

    // Indicates the size of the screen.
    private int SCREEN_SIZE;
    
    // Inidcates if the television is currently powered on.
    private boolean powerOn;
    
    // Shows which channel number the television is tuned to.
    private int channel;
    
    // Shows the current volume of the television (numerically).
    private int volume;
    
    
    // Constructor:
    
    // This constuctor takes in the manufacturer and screen size.
    public Television(String MANUFACTURER, int SCREEN_SIZE)
    {
        this.MANUFACTURER = MANUFACTURER;
        this.SCREEN_SIZE = SCREEN_SIZE;
        this.powerOn = false;
        this.volume = 20;
        this.channel = 2;
    }
    
    
    // Accessor methods:
    
    // Returns the volume of the television.
    public int getVolume()
    {
        return this.volume;
    }
    
    // Returns the channel of the television.
    public int getChannel()
    {
        return this.channel;
    }
    
    // Returns the manufacturer of the television.
    public String getManufacturer()
    {
        return this.MANUFACTURER;
    }
    
    // Returns the screen size of the television.
    public int getScreenSize()
    {
        return this.SCREEN_SIZE;
    }
    
    // Mutator methods:
    
    // Changes the channel of the television.
    public void setChannel(int channel)
    {
        this.channel = channel;
    }
    
    // If the television is on, this method will turn it off. Otherwise, the method will turn the television on.
    public void power()
    {
        this.powerOn = !this.powerOn;
    }
    
    // Increases the volume of the television by 1.
    public void increaseVolume()
    {
        this.volume++;
    }
    
    // Decreases the volume of the television by 1.
    public void decreaseVolume()
    {
        this.volume--;
    }
}

