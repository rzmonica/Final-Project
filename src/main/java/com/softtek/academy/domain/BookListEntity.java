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
@Table(name = "book_list")
public class BookListEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "bookList_id", unique = true, nullable = false)
	private Long bookListId; 
	
	@OneToOne
	@JoinColumn(name = "book_id")
	private BookEntity bookId;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrdersEntity orderId;

	public BookListEntity() {
		super();
	}
	
	public BookListEntity(Long bookListId, BookEntity bookId, OrdersEntity orderId) {
		super();
		this.bookListId = bookListId;
		this.bookId = bookId;
		this.orderId = orderId;
	}

	public Long getBookListId() {
		return bookListId;
	}

	public void setBookListId(Long bookListId) {
		this.bookListId = bookListId;
	}

	public BookEntity getBookId() {
		return bookId;
	}

	public void setBookId(BookEntity bookId) {
		this.bookId = bookId;
	}

	public OrdersEntity getOrderId() {
		return orderId;
	}

	public void setOrderId(OrdersEntity orderId) {
		this.orderId = orderId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((bookListId == null) ? 0 : bookListId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
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
		BookListEntity other = (BookListEntity) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (bookListId == null) {
			if (other.bookListId != null)
				return false;
		} else if (!bookListId.equals(other.bookListId))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookListEntity [bookListId=" + bookListId + ", bookId=" + bookId + ", orderId=" + orderId + "]";
	}
	
	
}
