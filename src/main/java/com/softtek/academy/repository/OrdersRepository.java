package com.softtek.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.softtek.academy.domain.OrdersEntity;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity, Long> {

//	@Query(value = "SELECT o.order_id, u.username, u.user_name, b.book_id FROM orders o INNER JOIN book_list b ON b.bookList_id = o.bookList_id INNER JOIN user u ON u.user_id = o.user_id GROUP BY u.user_name")
//	public OrdersEntity findOrdersByUser();
	
}
