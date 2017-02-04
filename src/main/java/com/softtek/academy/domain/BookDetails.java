package com.softtek.academy.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;

/**
 * 
 * Class that represents book details which is embedded in BookEntity
 *
 */

@Embeddable
public class BookDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "code_book")
	private String code; 
	
	@Column(name = "book_name")
	private String name; 
	
	@Column(name = "editorial")
	private String editorial; 
	
	@Column(name = "author")
	private String author; 
	
	@Column(name = "gender")
	private String gender; 
	
	@Column(name = "year_book")
	private int year; 
	
	@Column(name="status_book")
	@Convert(converter = StatusBookConverter.class)
	private String status;
	
	public BookDetails() {
		super();
		
	}

	public BookDetails(String code, String name, String editorial, String author, String gender, int year,
			String status) {
		super();
		this.code = code;
		this.name = name;
		this.editorial = editorial;
		this.author = author;
		this.gender = gender;
		this.year = year;
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((editorial == null) ? 0 : editorial.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + year;
		return result;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookDetails other = (BookDetails) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (editorial == null) {
			if (other.editorial != null)
				return false;
		} else if (!editorial.equals(other.editorial))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookDetails [code=" + code + ", name=" + name + ", editorial=" + editorial + ", author=" + author
				+ ", gender=" + gender + ", year=" + year + ", status=" + status + "]";
	}
	
}
