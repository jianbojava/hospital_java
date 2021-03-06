﻿package com.cocosh.hos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cocosh.framework.annotation.LogClass;
import com.cocosh.framework.base.BaseConditionVO;
import com.cocosh.framework.mybatis.Page;
import com.cocosh.framework.mybatis.PaginationInterceptor;
import com.cocosh.framework.util.StringUtil;
import com.cocosh.hos.mapper.OrderTestMapper;
import com.cocosh.hos.model.OrderTest;
import com.cocosh.hos.service.OrderTestService;

@Transactional
@Service
public class OrderTestServiceImpl implements OrderTestService {
	@Autowired
	private OrderTestMapper mapper;

	@LogClass(module = "术中测试管理", method = "添加")
	@Override
	public boolean add(OrderTest po) {
		po.setId(StringUtil.getUuid());
		return mapper.add(po) > 0;
	}
	
    @LogClass(module = "术中测试管理", method = "删除")
	@Override
	public boolean del(String ids) {
		return mapper.del(ids.split(",")) > 0;
	}

	@LogClass(module = "术中测试管理", method = "修改")
	@Override
	public boolean update(OrderTest po) {
		return mapper.update(po) > 0;
	}

	@Override
	public Page<OrderTest> queryPage(BaseConditionVO vo) {
		PaginationInterceptor.startPage(vo.getPageNo(),vo.getPageSize());
		mapper.queryPage(vo);
		Page<OrderTest> page=PaginationInterceptor.endPage();
		return page;
	}

	@Override
	public OrderTest queryById(String id) {
		return mapper.queryById(id);
	}

	@Override
	public OrderTest queryByOrderId(String order_id) {
		return mapper.queryByOrderId(order_id);
	}
	
}
