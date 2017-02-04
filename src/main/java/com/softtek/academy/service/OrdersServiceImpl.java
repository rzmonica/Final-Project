package com.softtek.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.domain.OrdersEntity;
import com.softtek.academy.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	OrdersRepository ordersRepository;

	@Override
	public List<OrdersEntity> list() {
		return ordersRepository.findAll(); 
	}

}
