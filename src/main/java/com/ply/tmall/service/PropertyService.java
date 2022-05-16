package com.ply.tmall.service;

import com.ply.tmall.dao.PropertyDAO;
import com.ply.tmall.pojo.Category;
import com.ply.tmall.pojo.Property;
import com.ply.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ply
 * @date 2021/10/3 - 13:54
 */

@Service
@CacheConfig(cacheNames="properties")
public class PropertyService {

    @Autowired
    PropertyDAO propertyDAO;
    @Autowired
    CategoryService categoryService;
    //属性增加
    @CacheEvict(allEntries=true)
    public void add(Property bean) {
        propertyDAO.save(bean);
    }
    //属性删除
    @CacheEvict(allEntries=true)
    public void delete(int id) {
        propertyDAO.delete(id);
    }
    //编辑功能
    @Cacheable(key="'properties-one-'+ #p0")
    public Property get(int id) {
        return propertyDAO.findOne(id);
    }
    //属性修改
    @CacheEvict(allEntries=true)
    public void update(Property bean) {
        propertyDAO.save(bean);
    }
    //属性查询页面
    @Cacheable(key="'properties-cid-'+#p0+'-page-'+#p1 + '-' + #p2 ")
    public Page4Navigator<Property> list(int cid, int start, int size,int navigatePages) {
        Category category = categoryService.get(cid);

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);

        Page<Property> pageFromJPA =propertyDAO.findByCategory(category,pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);

    }
    //分类获取所有属性集合的方法
    @Cacheable(key="'properties-cid-'+ #p0.id")
    public List<Property> listByCategory(Category category){
        return propertyDAO.findByCategory(category);
    }

}
