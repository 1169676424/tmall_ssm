package com.ply.tmall.dao;

import com.ply.tmall.pojo.Product;
import com.ply.tmall.pojo.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ply
 * @date 2021/10/3 - 15:06
 */

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer> {
     List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);

}
