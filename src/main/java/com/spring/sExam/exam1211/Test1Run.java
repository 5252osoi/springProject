package com.spring.sExam.exam1211;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("xml/test1.xml");
		Test1Infor infor = (Test1Infor) ctx.getBean("infor");
		
		System.out.println("driver : "+ infor.getDriver());
		System.out.println("url : "+infor.getUrl());
		System.out.println("user : "+infor.getUser());
		System.out.println("password : "+infor.getPassword());
	}
}
