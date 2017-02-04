package com.softtek.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.academy.domain.BookEntity;

/**
 * Repository Book
 */

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
	
 	@Query(name = "createBook", nativeQuery = true)
	public boolean createBook(@Param("codeBook") String code,
							@Param("bookName") String name,
							@Param("bookEditorial") String editorial,
							@Param("bookAuthor") String author,
							@Param("bookGender") String gender,
							@Param("bookYear") Integer year,
							@Param("bookStatus") String status); 

}
