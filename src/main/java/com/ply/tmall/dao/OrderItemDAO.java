package com.ply.tmall.dao;

import com.ply.tmall.pojo.Order;
import com.ply.tmall.pojo.OrderItem;
import com.ply.tmall.pojo.Product;
import com.ply.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ply
 * @date 2021/10/3 - 17:26
 */

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);//通过订单查询
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}
