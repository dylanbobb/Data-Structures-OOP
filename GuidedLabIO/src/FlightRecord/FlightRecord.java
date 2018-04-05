package FlightRecord;

public class FlightRecord
{
    private String flightNumber;
    private String origin;
    private String destination;
    private int numPassengers;
    private double avgTicketPrice;
    
    public FlightRecord(String flightNumber, String origin, String destination, int numPassengers, double avgTicketPrice)
    {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.numPassengers = numPassengers;
        this.avgTicketPrice = avgTicketPrice;
    }
    
    @Override
    public String toString()
    {
      return "Flight " + flightNumber   + ": from " + origin  + " to " + destination + "\n\t" + numPassengers + " passengers"
           + "; average ticket price: "  + avgTicketPrice;
  
    }
} 