package com.satyam.service;

import com.satyam.bean.*;
import com.satyam.dao.OrderDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private double coffeePrice;
    private double addonPrice;
    private double sizePrice;
    private double discountPrice;
    private double bill=0;

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Autowired
    private CoffeeService coffeeService;
    @Autowired
    private AddOnService addOnService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private DiscountService discountService;
    @Autowired
    private OrderDao orderDao;

    @Override
    public double calculateBill(int coffeeId, int addonId, int sizeId, int discountId) {

        coffeePrice = coffeeService.getCoffeePriceById(coffeeId);
        bill += coffeePrice;

        addonPrice = addOnService.getAddonPriceById(addonId);
        bill += addonPrice;

        sizePrice = sizeService.getSizePriceById(sizeId);
        bill += sizePrice;

        discountPrice = discountService.getDiscountPriceById(discountId);
        bill = bill - (bill*discountPrice)/100;

        System.out.println("bill"+bill);

        return bill;
    }

    @Override
    public List getDetails(Order order) {
        return null;
    }

    @Override
    public void placeOrder(Order order) {
        /*
        Coffee coffee = coffeeService.getAllCoffee().get(order.getCoffeeID());
        Size size = sizeService.getAllSize().get(order.getSizeID());
        AddOns addOns = addOnService.getAllAddOns().get(order.getAddonID());
        Discount discount = discountService.getAllCoupons().get(order.getDiscountID());

         */
        List<Order> orderList = (List<Order>) orderDao.findAll();
        int max =0;
        for(Order order1: orderList)
        {
            max = order1.getOrderID();
        }
        order.setOrderID(++max);
        orderDao.save(order);
    }
}
