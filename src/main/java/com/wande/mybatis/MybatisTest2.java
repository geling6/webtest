package com.wande.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wande.mybatis.bean.User;
import com.wande.mybatis.dao.UserMapper;

public class MybatisTest2 {

	public static void main(String[] args) throws Exception{
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			User user = new User();
			user.setAccount("tongleiyan");
			user.setUserName("仝磊燕");
			user.setPassword("fucktongleiyan");
			user.setStatus(2);
			user.setEmail("tongleiyan@fuck.com");
			UserMapper userMapper = session.getMapper(UserMapper.class);
			
			int count = userMapper.insertUser(user);
			session.commit();
			System.out.println(count);
		} finally {
		  session.close();
		}
	}

}
