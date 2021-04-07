package com.ply.tmall.service;

import com.ply.tmall.pojo.Product;
import com.ply.tmall.pojo.PropertyValue;

import java.util.List;

/**
 * @author ply
 * @date 2021/3/3 - 19:48
 */
public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}
