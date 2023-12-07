package com.spring.sExam.exam1207;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukXmlRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("xml/sungjuk.xml");
		
		SungjukVO vo = (SungjukVO) ctx.getBean("vo");
		
		vo.sungjukTitle();
		vo.sungjukCalc();
		vo.sungjukPrint();
		
		SungjukVO vo2 = (SungjukVO) ctx.getBean("vo");
		
		vo2.sungjukCalc();
		vo2.sungjukPrint();
		ctx.close();
	}

}
