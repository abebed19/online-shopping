
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class Warehouse {
    
    private Map<String,Integer> stocks;
    private Map<String,Integer> stocksStored;
    
    public Warehouse(){
        this.stocks = new HashMap<>();
        this.stocksStored = new HashMap<>();
        
    }
    
    public void addProduct(String product, int price, int stock){
        
        if(!stocks.containsKey(product)){
            stocks.put(product, price);
        }
        if(!stocksStored.containsKey(product))
            stocksStored.put(product, stock);
       
     }
    
    
    public int price(String product){
        if(stocks.containsKey(product))
            return stocks.get(product);
        return -99;
    }
    
    
    public int stock(String product){
        if(stocksStored.containsKey(product))
            return stocksStored.get(product);
        return 0;
    }
    
    public boolean take(String product){
        
       boolean isTaken = false;
       if(stocksStored.containsKey(product)){
           
           
           int newStock = stocksStored.get(product)-1;
           
           if(newStock>=0){
               stocksStored.put(product, newStock);
               isTaken = true;
           }else{
               isTaken = false;
           }
           
       }
       return isTaken;
    }
    
    public Set<String> products(){
        
        return  stocks.keySet();
    }
    

}