package com.ply.tmall.service;

import com.ply.tmall.pojo.Property;

import java.util.List;

/**
 * @author ply
 * @date 2021/3/3 - 16:38
 */
public interface PropertyService {
    void add(Property c);
    void delete(int id);
    void update(Property c);
    Property get(int id);
    List list(int cid);
}
