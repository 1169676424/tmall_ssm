package com.ply.tmall.dao;

import com.ply.tmall.pojo.Product;
import com.ply.tmall.pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ply
 * @date 2021/10/4 - 14:21
 */

public interface ReviewDAO extends JpaRepository<Review,Integer> {
    List<Review> findByProductOrderByIdDesc(Product product);//返回某产品对应的评价集合
    int countByProduct(Product product);//返回某产品对应的评价数量

}
