package com.ply.tmall.dao;

import com.ply.tmall.pojo.Order;
import com.ply.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ply
 * @date 2021/10/3 - 17:28
 */
public interface OrderDAO extends JpaRepository<Order,Integer> {
     List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);//获取某个用户的订单
}
