package com.niit.bookshop.Controller;

import com.niit.bookshop.dao.BookDao;
import com.niit.bookshop.dao.OrderDao;
import com.niit.bookshop.dao.UserDao;
import com.niit.bookshop.entity.Book;
import com.niit.bookshop.entity.Order;
import com.niit.bookshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    UserDao userDao;
    @Autowired
    OrderDao orderDao;
    @Autowired
    BookDao bookDao;

    @RequestMapping("/hello")
    public String goHello(){
        List<User> us = userDao.findAll();
        for (User u: us
             ) {
            System.out.println(u);
        }
        return "hello";
    }
    @RequestMapping("/order")
    public String goOrder(ModelMap map){
        List<Order> orderList = orderDao.findAll();
        map.addAttribute("value",orderList);
        return "order";
    }
    @RequestMapping("/order/CRUD")
    @ResponseBody
    public String orderCRUD(Integer oidData){
        try{
            orderDao.deleteByPrimaryKey(oidData);
            return "100";
        }catch (Exception e){
            e.printStackTrace();
            return "101";
        }

    }
    @RequestMapping("/book")
    public String gobook(ModelMap mp){
        List<Book> books = bookDao.findAll();
        mp.addAttribute("book",books);
        return "book";
    }
    
}
