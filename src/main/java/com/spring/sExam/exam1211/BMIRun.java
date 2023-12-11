package com.spring.sExam.exam1211;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
비만도(BMI) 계산하는 프로그램을 만드시오.
공식 : 몸무게 / (키백분율 * 키백분율)
예) 키:170Cm, 몸무게:65Kg
   비만지수 구하는 공식 : 65 / (1.7 * 1.7)
   비만지수에 대한 판정?
     저체중: 18.5미만, 표준 : 18.5~23 , 과체중:23~25, 비만:25초과
   
   데이터의 주입은 xml을 통해서 처리한다.(입력값 : 비만지수값, 개인별 성명/키/몸무게)
*/

public class BMIRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/bmi.xml");
		
		BMIVO vo = new BMIVO();
		
		vo.getService().printTitle();
		vo.getService().printLine();
		
		BMIVO[] bmis= {(BMIVO) ctx.getBean("person1"),(BMIVO) ctx.getBean("person2"),(BMIVO) ctx.getBean("person3"),(BMIVO) ctx.getBean("person4")};
		
		for(BMIVO v : bmis) {
			v.getService().calc(v);
			v.getService().printBMI(v);
			v.getService().printLine();
		}
		/*
		BMIVO vo1 =(BMIVO) ctx.getBean("person1");
		vo.getService().calc(vo1);
		vo.getService().printBMI(vo1);
		BMIVO vo2 =(BMIVO) ctx.getBean("person2");
		vo.getService().calc(vo2);
		vo.getService().printBMI(vo2);
		BMIVO vo3 =(BMIVO) ctx.getBean("person3");
		vo.getService().calc(vo3);
		vo.getService().printBMI(vo3);
		BMIVO vo4 =(BMIVO) ctx.getBean("person4");
		vo.getService().calc(vo4);
		vo.getService().printBMI(vo4);
		*/
		ctx.close();
		
	}
}
