package com.wande.mybatis;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wande.mybatis.bean.User;
import com.wande.mybatis.dao.UserMapper;

public class MybatisTest {
	public static void main(String[] args) throws Exception{
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			
		   /* User user = (User) session.selectOne("com.wande.mybatis.dao.UserMapper.selectById", 129);
		    System.out.println(user.getAccount());*/
		    
		    /*User user = mapper.selectById(128);
			System.out.println(user.getUserName());*/
			  
			/*List<User> users = mapper.selectUsers();
			System.out.println(users);*/
			
			/*Map<String,Object> map = mapper.selectMapById(128);
			System.out.println(map);*/
			
			/*List<Map<String,Object>> maps = mapper.selectMapByStatus(0);
			System.out.println(maps);*/
			
			User user1 = new User();
			user1.setId(128);
			user1.setUserName("王灵灵");
			user1.setAccount("wanglingb");
			
			User user2 = new User();
			user2.setId(129);
			user2.setUserName("王倩");
			user2.setAccount("wangqianb");
			
			List<User> users = new ArrayList<User>();
			users.add(user1);
			users.add(user2);
			int count = mapper.updateUsers(users);
			System.out.println(count);
			session.commit();
		} finally {
		  session.close();
		}
				
	}
}
