package com.ply.tmall.service;

import com.ply.tmall.pojo.Order;
import com.ply.tmall.pojo.OrderItem;

import java.util.List;

/**
 * @author ply
 * @date 2021/3/3 - 21:14
 */
public interface OrderService {

    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);
    float add(Order c,List<OrderItem> ois);
    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();
    List list(int uid, String excludedStatus);
}
