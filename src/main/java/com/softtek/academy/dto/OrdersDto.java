package com.softtek.academy.dto;

public class OrdersDto {
	
	private Long orderId;
	private UserDto userId;
	private BookDto bookId;
	
	public OrdersDto() {
		super();
	} 
	
	public OrdersDto(Long orderId, UserDto userId, BookDto bookId) {
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

	public UserDto getUserId() {
		return userId;
	}

	public void setUserId(UserDto userId) {
		this.userId = userId;
	}

	public BookDto getBookId() {
		return bookId;
	}

	public void setBookId(BookDto bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "OrdersDto [orderId=" + orderId + ", userId=" + userId + ", bookId=" + bookId + "]";
	} 
	

}
