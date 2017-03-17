package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.wande.web.bean.User;

public class BeanFactoryTest {
	public static void main(String[] args) {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("spring-servlet.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		User user = (User) factory.getBean("user");
		System.out.println(user.getId());
	}
}
