package com.techelevator.farm.finance;

import com.techelevator.farm.interfaces.Sellable;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Invoice {

    Map<Sellable, Integer> cart;

    public Invoice (){
        cart = new HashMap<>();
    }

    public void addToCart(Sellable product, int quantity){
        if (!cart.containsKey(product)) {
            cart.put(product, quantity);
        }
        else {
            cart.put(product, cart.get(product)+ quantity);
        }
    }

    public void removeFromCart(Sellable product, int quantity){
        cart.remove(product, quantity);

    }

    public void emptyCart(){


    }

    public int getQuantity(Sellable product){
        return 0;
    }

    public BigDecimal getCartTotal(){

        return null;
    }

}
