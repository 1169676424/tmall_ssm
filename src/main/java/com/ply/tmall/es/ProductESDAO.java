package com.ply.tmall.es;

import com.ply.tmall.pojo.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author ply
 * @date 2021/10/4 - 23:49
 */
public interface ProductESDAO extends ElasticsearchRepository<Product,Integer> {
}
