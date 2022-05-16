package com.ply.tmall.dao;

import com.ply.tmall.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ply
 * @date 2021/10/3 - 17:08
 */

public interface AdminDAO extends JpaRepository<Admin,Integer> {

    Admin getByNameAndPassword(String name, String password);
}
