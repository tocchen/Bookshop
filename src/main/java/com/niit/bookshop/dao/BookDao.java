package com.niit.bookshop.dao;

import com.niit.bookshop.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    List<Book> findAll();
    Book findById(int id);
}
