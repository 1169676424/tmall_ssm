package com.ply.tmall.dao;

import com.ply.tmall.pojo.Category;
import com.ply.tmall.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ply
 * @date 2021/10/3 - 14:42
 */

public interface ProductDAO extends JpaRepository<Product,Integer> {
    Page<Product> findByCategory(Category category, Pageable pageable);
    List<Product> findByCategoryOrderById(Category category);//通过分类查询所有产品
    List<Product> findByNameLike(String keyword, Pageable pageable);//根据名称进行模糊查询
}
