package com.niit.bookshop.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * order
 * @author 
 */
@Data
public class Order implements Serializable {
    private Integer oid;

    private String orderid;

    private Date date;

    private User user;

    private Book book;

    private Integer orderNum;

    private static final long serialVersionUID = 1L;

}