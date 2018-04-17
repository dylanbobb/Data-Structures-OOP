package stock;

import java.util.ArrayList;
import java.util.HashMap;

// This class will create an arraylist of stocks and then input those stocks into a hashmap
// By doing so, stocks can be searched by their stockNumber, returning the stock's data (Name and quantity)
public class StockDemo
{
    // Creating a hashmap to store the stocks.
    static HashMap<Integer,Data> stockMap = new HashMap();

    public static void main(String[] args)
    {
        // Creating an ArrayList of stocks with some test values
        ArrayList<Stock> stockList = new ArrayList();
        stockList.add(new Stock(0,"Book",10));
        stockList.add(new Stock(1,"Chair",50));
        stockList.add(new Stock(2,"Table",642));
        
        for(Stock x:stockList)
        {
            // Add each element of the arraylist into the hashmap where the stockNumber is the key and the name and quantity are the values.
            stockMap.put(x.getStockNumber(),x.getData());
        }

        /*
            Using the search method with our test values.
        */
        // We expect this search to work.
        System.out.println("Searching for stockNumber 0: ");
        search(0);
        // We expect this search to fail.
        System.out.println("Searching for stockNumber 10: ");
        search(10);
    }

    // This method will lookup stockNumbers in the hashmap and display their data if they exist
    public static void search(int stockNumber)
    {
        // If the stock exists, print its data
        if(stockMap.containsKey(stockNumber))
        {
            System.out.println(stockMap.get(stockNumber));
        }
        // Otherwise display an error
        else
        {
            System.out.println("Error: No stock exists with that stock number");
        }
    }
}