package com.satyam.service;

import com.satyam.bean.Order;

import java.util.List;

public interface OrderService {
    public double calculateBill(int coffeeId, int addonId, int sizeId, int discountId);
    public List getDetails(Order order);
    public void placeOrder(Order order);
}
