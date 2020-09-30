package com.satyam.dao;

import com.satyam.bean.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends CrudRepository<Order,Integer> {

    //public Order placeOrder(@Param("coffeeID") int coffeeID,@Param("addonID") int addonID,@Param("sizeID") int sizeID,@Param("discountID") int discountID);
}
