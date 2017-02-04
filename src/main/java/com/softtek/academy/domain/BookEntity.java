package com.softtek.academy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@NamedNativeQueries({
		@NamedNativeQuery(
				name = "createBook",
				query = "INSERT book b,"
						+ "b.book_id = :bookId"
						+ "b.code_book = :codeBook, "
						+ "b.book_name = :bookName, "
						+ "b.editorial = :bookEditorial, "
						+ "b.author = :bookAuthor, "
						+ "b.gender = :bookGender, "
						+ "b.year_book = :bookYear,"
						+ "b.status_book = :bookStatus"
						+ "b.create_date = :createDate",
				resultSetMapping = "createBookResult"), 
})
	@SqlResultSetMappings({
		@SqlResultSetMapping(name="createBookResult", columns = { @ColumnResult(name = "count")})
	})



public class BookEntity implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "book_id", unique=true, nullable = false)
	private Long bookId;
	
	@Embedded
	private BookDetails bookDetails;
	
	public BookEntity() {
		super();
	}

	public BookEntity(Long bookId, BookDetails bookDetails) {
		super();
		this.bookId = bookId;
		this.bookDetails = bookDetails;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public BookDetails getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookDetails == null) ? 0 : bookDetails.hashCode());
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
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
		BookEntity other = (BookEntity) obj;
		if (bookDetails == null) {
			if (other.bookDetails != null)
				return false;
		} else if (!bookDetails.equals(other.bookDetails))
			return false;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookEntity [bookId=" + bookId + ", bookDetails=" + bookDetails + "]";
	} 
	
	
}