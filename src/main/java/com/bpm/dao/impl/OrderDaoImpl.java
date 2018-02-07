package com.bpm.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bpm.dao.inf.OrderDao;
import com.bpm.model.OrderItem;


@Repository("orderDao")
@Transactional
public class OrderDaoImpl implements OrderDao{
	private static Logger log = Logger.getLogger(OrderDaoImpl.class.getName()); 
	
	@Override
	public List<OrderItem> createOrder() {
		log.info("OrderDaoImpl.createOrder()");
		
		List orderList = new ArrayList<OrderItem>();
		OrderItem orderItem = new OrderItem();
		orderItem.setItemId(1000);
		orderItem.setItemCount(1);
		orderList.add(orderItem);
		
		orderItem = new OrderItem();
		orderItem.setItemId(1001);
		orderItem.setItemCount(1);
		orderList.add(orderItem);
		
		return orderList;
	}

	@Override
	public List<OrderItem> editOrder() {
		log.info("OrderDaoImpl.editOrder()");
		return null;
	}

	@Override
	public List<OrderItem> deleteOrder() {
		log.info("OrderDaoImpl.deleteOrder()");
		return null;
	}

	@Override
	public List<OrderItem> findOrder() {
		log.info("OrderDaoImpl.findOrder()");
		return null;
	}

	@Override
	public List<OrderItem> findAllOrder() {
		log.info("OrderDaoImpl.findOrder()");
		return null;
	}

}
