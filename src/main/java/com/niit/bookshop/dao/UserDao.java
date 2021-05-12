package com.niit.bookshop.dao;

import com.niit.bookshop.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> findAll();
}
