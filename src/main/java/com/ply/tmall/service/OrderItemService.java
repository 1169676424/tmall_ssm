package com.ply.tmall.service;

import com.ply.tmall.pojo.Order;
import com.ply.tmall.pojo.OrderItem;

import java.util.List;

/**
 * @author ply
 * @date 2021/3/3 - 21:07
 */
public interface OrderItemService {


    void add(OrderItem c);

    void delete(int id);
    void update(OrderItem c);
    OrderItem get(int id);
    List list();

    void fill(List<Order> os);

    void fill(Order o);

    int getSaleCount(int  pid);

    List<OrderItem> listByUser(int uid);

}
