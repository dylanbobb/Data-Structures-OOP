package stock;

import java.util.ArrayList;
import java.util.HashMap;

public class StockDemo
{
    public static void main(String[] args)
    {
        ArrayList<Stock> stockList = new ArrayList();
        stockList.add(new Stock(0,"Book",10));
        stockList.add(new Stock(1,"Chair",50));
        
        HashMap<Integer,Data> stockMap = new HashMap();
        
        for(Stock x:stockList)
        {
            stockMap.put(x.getStockNumber(),x.getData());
        }
        
        stockMap.forEach((k,v) -> System.out.println(k + "\t" + v));
    }
}