
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.qty * this.unitPrice;
    }
    
    public void increaseQuantity(){
        this.qty = this.qty + 1;
    }
    
    @Override
    public String toString(){
        return this.product +": "+this.qty;
    }
    @Override
    public boolean equals(Object ob){
        if(ob == null)
            return false;
        Item i = (Item) ob;
        if(this.product == i.product  && this.unitPrice == i.unitPrice){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.product);
        hash = 83 * hash + this.unitPrice;
        return hash;
    }
            
    
}
