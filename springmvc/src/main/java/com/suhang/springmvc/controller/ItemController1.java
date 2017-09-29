package com.suhang.springmvc.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import com.suhang.springmvc.mapper.ItemsMapper;
import com.suhang.springmvc.po.Items;
import com.suhang.springmvc.po.ItemsCustomer;
import com.suhang.springmvc.serivice.ItemsService;

/**
 * @author hang.su
 * @since 2017-09-27 12:02
 */
@Controller
public class ItemController1{

    @Autowired
     private ItemsService itemsService;

    @RequestMapping("/queryitem")
    public ModelAndView queryitem()throws Exception {
        List<ItemsCustomer>itemsList= itemsService.findItemsList(null);
        ModelAndView modelAndView = new ModelAndView();

//        modelAndView.addObject("itemslist",itemsList);
        modelAndView.setViewName("WEB-INF/jsp/itemslist.jsp");

        return modelAndView;
    }
}
