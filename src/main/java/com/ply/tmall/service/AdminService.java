package com.ply.tmall.service;

import com.ply.tmall.dao.AdminDAO;
import com.ply.tmall.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
 * @author ply
 * @date 2021/10/3 - 17:09
 */

@Service
@CacheConfig(cacheNames="admins")
public class AdminService {

    @Autowired
    AdminDAO adminDAO;

    public Admin login(String name,String password) {
        Admin admin1 = adminDAO.getByNameAndPassword(name, password);
        return admin1;
    }


}
