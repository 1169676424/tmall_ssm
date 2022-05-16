package com.ply.tmall.dao;

import com.ply.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ply
 * @date 2021/10/3 - 17:08
 */

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByName(String name);

    User getByNameAndPassword(String name, String password);
}
