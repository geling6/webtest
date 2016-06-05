package com.wanda.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.wanda.mybatis.bean.User;

public interface UserMapper {
	
	User selectById(Integer id);
	
	@Select("select * from user")
	List<User> selectUsers();
	
	Integer getIdByName(String username);
	
	Map<String,Object> selectMapById(Integer id);
	
	List<Map<String,Object>> selectMapByStatus(int status);
}
