package com.wande.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wande.mybatis.bean.User;

public interface UserMapper {
	
	User selectById(Integer id);
	
	@Select("select * from user")
	List<User> selectUsers();
	
	Integer getIdByName(String username);
	
	Map<String,Object> selectMapById(Integer id);
	
	List<Map<String,Object>> selectMapByStatus(int status);
	
	int insertUser(User user);
	
	int updateUsers(@Param("users")List<User> users);
}
