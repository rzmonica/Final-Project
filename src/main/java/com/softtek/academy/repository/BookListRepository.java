package com.softtek.academy.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookListRepository {

	@Query(name="createBook", nativeQuery = true)
	public boolean createBook(String code, String name, String editorial, String author, String gender,
			String year, String status);
}
