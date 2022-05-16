package com.ply.tmall.dao;

import com.ply.tmall.pojo.Product;
import com.ply.tmall.pojo.Property;
import com.ply.tmall.pojo.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ply
 * @date 2021/10/3 - 15:56
 */

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer> {

    List<PropertyValue> findByProductOrderByIdDesc(Product product);//根据产品查询
    PropertyValue getByPropertyAndProduct(Property property, Product product);//根据产品和属性获取PropertyValue对象

}
