package com.ply.tmall.dao;

import com.ply.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ply
 * @date 2021/10/2 - 16:08
 */

public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
