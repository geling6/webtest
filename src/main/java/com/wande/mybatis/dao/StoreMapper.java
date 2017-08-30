package com.wande.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wande.mybatis.bean.Store;

public interface StoreMapper {
	
	List<Store> queryStores(@Param("offset")Integer offset, @Param("limit")Integer limit);
	
	int count();
}
