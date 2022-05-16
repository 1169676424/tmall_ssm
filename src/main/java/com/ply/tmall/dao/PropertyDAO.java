package com.ply.tmall.dao;

import com.ply.tmall.pojo.Category;
import com.ply.tmall.pojo.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ply
 * @date 2021/10/3 - 13:52
 */

public interface PropertyDAO extends JpaRepository<Property,Integer> {
    Page<Property> findByCategory(Category category, Pageable pageable);
    List<Property> findByCategory(Category category);//分类获取所有属性集合的方法
}
