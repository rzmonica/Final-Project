package com.softtek.academy.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrdersEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "order_id")
	private Long orderId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity userId;

	@OneToOne
	@JoinColumn(name = "book_id")
	private BookEntity bookId;
	
	public OrdersEntity() {
		super();
	}
	
	public OrdersEntity(Long orderId, UserEntity userId, BookEntity bookId) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.bookId = bookId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public UserEntity getUserId() {
		return userId;
	}

	public void setUserId(UserEntity userId) {
		this.userId = userId;
	}

	public BookEntity getBookId() {
		return bookId;
	}

	public void setBookId(BookEntity bookId) {
		this.bookId = bookId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdersEntity other = (OrdersEntity) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrdersEntity [orderId=" + orderId + ", userId=" + userId + ", bookId=" + bookId + "]";
	}
}