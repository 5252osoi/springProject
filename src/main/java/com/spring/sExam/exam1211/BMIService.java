package com.spring.sExam.exam1211;

public class BMIService {
	public BMIVO calc(BMIVO vo) {
		double bmi = vo.getWeight()/((vo.getHeight()/100.0)*(vo.getHeight()/100.0));
		String str="";
		if(bmi<18.5) str="��ü���Դϴ�.";
		else if(bmi>=18.5 && bmi<=23) str="����ü���Դϴ�.";
		else if(bmi>23 && bmi<=25) str="��ü���Դϴ�.";
		else str="���Դϴ�.";
		
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
		System.out.println("�̸� : " +vo.getName());
		System.out.println("���� : " +vo.getHeight()+"cm");
		System.out.println("ü�� : " +vo.getWeight()+"kg");
		System.out.println(vo.getName()+" ���� BMI : "+String.format("%.1f",vo.getBmi()));
		System.out.println(vo.getName()+" ���� "+vo.getStr());
	}
	
	
}
