package com.niit.bookshop.entity;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String bookName;
    private String bookAuthor;
    private String bookImg;
    private Double bookPrice;
}
