package com.suhang.springmvc.serivice;

import java.util.List;

import com.suhang.springmvc.po.ItemsCustomer;
import com.suhang.springmvc.po.ItemsCustomerVo;

/**
 * @author hang.su
 * @since 2017-09-28 15:25
 */
public interface ItemsService {
    public List<ItemsCustomer> findItemsList(ItemsCustomerVo itemsCustomerVo)throws Exception;
}
