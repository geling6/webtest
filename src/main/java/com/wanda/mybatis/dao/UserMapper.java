package com.wanda.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wanda.mybatis.bean.User;

public interface UserMapper {
	
	User selectById(Integer id);
	
	@Select("select * from user")
	List<User> selectUsers();
}
