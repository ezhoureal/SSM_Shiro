package com.Test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

import com.Service.ShiroService;

//指定bean注入的配置文件  
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })  
//使用标准的JUnit 表示继承了SpringJUnit4ClassRunner类
@RunWith(SpringJUnit4ClassRunner.class) 
public class InsertTest {  
	@Resource
	private ShiroService shiroService;
	
	@Test
	public void insert() {
		try {
			shiroService.insert("eric","123456","user");
		}
		catch (Exception e) {
			System.out.println("Username already exists.");
		}
	}
}
