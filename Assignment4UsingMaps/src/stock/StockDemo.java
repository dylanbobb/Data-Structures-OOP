package stock;

import java.util.ArrayList;
import java.util.HashMap;

public class StockDemo
{
    public static void main(String[] args)
    {
        // Creating an ArrayList of stocks
        ArrayList<Stock> stockList = new ArrayList();
        stockList.add(new Stock(0,"Book",10));
        stockList.add(new Stock(1,"Chair",50));

        // Creating a hashmap to store these stocks.
        HashMap<Integer,Data> stockMap = new HashMap();
        
        for(Stock x:stockList)
        {
            // Add each element of the arraylist into the hashmap where the stockNumber is the key and the name and quantity are the values.
            stockMap.put(x.getStockNumber(),x.getData());
        }

        // Display the hashmap.
        stockMap.forEach((k,v) -> System.out.println(k + "\t" + v));
    }
}