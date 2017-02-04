package com.softtek.academy.service;

import java.util.List;
import com.softtek.academy.domain.UserEntity;

public interface UserService {
	
	public List<UserEntity> list(); 
	
	public UserEntity findByUsername(String username);

}
