package com.softtek.academy.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.academy.domain.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {


}
