package com.ply.tmall.service;

import com.ply.tmall.pojo.ProductImage;

import java.util.List;

/**
 * @author ply
 * @date 2021/3/3 - 18:34
 */
public interface ProductImageService {

    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage pi);
    void delete(int id);
    void update(ProductImage pi);
    ProductImage get(int id);
    List list(int pid, String type);
}