
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class ShoppingCart {
    
    private List<Item> cartItems;
    
    
    public ShoppingCart(){
        this.cartItems = new ArrayList<>();    
    }
    
    public void add(String product, int price){
        
        Item tobeAdded = new Item(product,1,price);
        if(this.cartItems.contains(tobeAdded)){
            int index =this.cartItems.indexOf(tobeAdded);
            this.cartItems.get(index).increaseQuantity();
            
        }else{
            this.cartItems.add(tobeAdded);
        }
        
        
    }
    public int price(){
        
        int totalPrice = 0;
        for(Item item : cartItems){
            totalPrice = totalPrice +item.price();
        }
        return totalPrice;
        
    }
    public void print(){
        for(Item item : cartItems){
            System.out.println(item);
        }
    }
    
}
