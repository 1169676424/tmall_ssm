package com.ply.tmall.service;

import com.ply.tmall.pojo.User;

import java.util.List;

/**
 * @author ply
 * @date 2021/3/3 - 19:57
 */
public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
    boolean isExist(String name);

    User get(String name, String password);
}