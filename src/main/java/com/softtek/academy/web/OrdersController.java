package com.softtek.academy.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softtek.academy.domain.OrdersEntity;
import com.softtek.academy.service.OrdersService;

@RequestMapping(value = "/order")
@Controller
public class OrdersController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrdersController.class);
	
	@Autowired
	OrdersService ordersService; 
	
	@RequestMapping(value = "/list")
	public String ListView(){
		return "OrderList";
	}
	
	@RequestMapping(value = "/orderList", method=RequestMethod.GET)
	public ResponseEntity<?> List() {
		List<OrdersEntity> orders = ordersService.list(); 
		if (orders.isEmpty()) {

			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<OrdersEntity>>(orders, HttpStatus.OK);
		}
	}
}
