package com.suhang.springmvc.serviceimpl;

import java.util.List;

import com.suhang.springmvc.mapper.ItemsMapper;
import com.suhang.springmvc.po.ItemsCustomer;
import com.suhang.springmvc.po.ItemsCustomerVo;
import com.suhang.springmvc.serivice.ItemsService;

/**
 * @author hang.su
 * @since 2017-09-28 15:31
 */
public class ItemsServiceImpl implements ItemsService {
    private ItemsMapper itemsMapper;
    @Override
    public List<ItemsCustomer> findItemsList(ItemsCustomerVo itemsCustomerVo) throws Exception {
        return itemsMapper.findItemsList(itemsCustomerVo);
    }
}
