package com.ply.tmall.service;

import com.ply.tmall.pojo.Category;
import com.ply.tmall.util.Page;

import java.util.List;

/**
 * @author ply
 * @date 2021/3/2 - 18:57
 */
public interface CategoryService{
    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
