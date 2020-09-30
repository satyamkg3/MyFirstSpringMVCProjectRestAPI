package com.satyam.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placeorder")
public class Order {
    @Id
    private Integer orderID;
    private Integer coffeeID;
    private Integer addOnID;
    private Integer sizeID;
    private Integer couponID;
    private Double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCoffeeID() {
        return coffeeID;
    }

    public void setCoffeeID(int coffeeID) {
        this.coffeeID = coffeeID;
    }

    public int getAddonID() {
        return addOnID;
    }

    public void setAddonID(int addonID) {
        this.addOnID = addonID;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getDiscountID() {
        return couponID;
    }

    public void setDiscountID(int discountID) {
        this.couponID = discountID;
    }
}
