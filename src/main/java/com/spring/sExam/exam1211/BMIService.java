package com.spring.sExam.exam1211;

public class BMIService {
	public BMIVO calc(BMIVO vo) {
		double bmi = vo.getWeight()/((vo.getHeight()/100.0)*(vo.getHeight()/100.0));
		String str="";
		if(bmi<18.5) str="저체중입니다.";
		else if(bmi>=18.5 && bmi<=23) str="정상체중입니다.";
		else if(bmi>23 && bmi<=25) str="과체중입니다.";
		else str="비만입니다.";
		
		vo.setBmi(bmi);
		vo.setStr(str);
		
		return vo; 
	}
	
	public void printLine() {
		System.out.println("=============================================================");
	}
	public void printTitle() {
		System.out.println("\tB M I ");
	}
	public void printBMI(BMIVO vo) {
		System.out.println("이름 : " +vo.getName());
		System.out.println("신장 : " +vo.getHeight()+"cm");
		System.out.println("체중 : " +vo.getWeight()+"kg");
		System.out.println(vo.getName()+" 님의 BMI : "+String.format("%.1f",vo.getBmi()));
		System.out.println(vo.getName()+" 님은 "+vo.getStr());
	}
	
	
}
