package com.suhang.springmvc.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suhang.springmvc.po.Items;
import com.suhang.springmvc.po.ItemsCustomer;
import com.suhang.springmvc.po.ItemsCustomerVo;

/**
 * @author hang.su
 * @since 2017-09-29 10:46
 */
public class ItemsMapperTest {
    private ClassPathXmlApplicationContext applicationContext;
    @Before
    public void setUp()throws Exception{

      applicationContext = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
    }

    @Test
    public void findItemsListTest() throws Exception {
        ItemsMapper itemsMapper = (ItemsMapper)applicationContext.getBean("itemsMapper");


        List<ItemsCustomer> itemslist =  itemsMapper.findItemsList(null);
    }
}
