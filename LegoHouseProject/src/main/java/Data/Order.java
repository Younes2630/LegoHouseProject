/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author Younes
 */
public class Order {
    
    private LegoHouse house;
    private int orderID;
    private String username;
    private String orderDate;
    private boolean isShipped;

    public Order(LegoHouse house, int orderID, String username, String orderDate, boolean shipped) {
        this.house = house;
        this.orderID = orderID;
        this.username = username;
        this.orderDate = orderDate;
        this.isShipped = isShipped;
    }

    public LegoHouse getHouse() {
        return house;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getUsername() {
        return username;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public boolean isShipped() {
        return isShipped;
    }

   
   
    
    
   

    
    
    
}
