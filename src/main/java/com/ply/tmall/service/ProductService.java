package com.ply.tmall.service;

import com.ply.tmall.pojo.Category;
import com.ply.tmall.pojo.Product;

import java.util.List;

/**
 * @author ply
 * @date 2021/3/3 - 17:14
 */
public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);

    void fill(List<Category> cs);

    void fill(Category c);

    void fillByRow(List<Category> cs);

    void setSaleAndReviewNumber(Product p);

    void setSaleAndReviewNumber(List<Product> ps);

    List<Product> search(String keyword);
}
