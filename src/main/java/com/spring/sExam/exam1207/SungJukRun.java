package com.spring.sExam.exam1207;

import java.util.Scanner;

public class SungJukRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SungjukVO vo = new SungjukVO();;

		
//		while(true) {
			vo=new SungjukVO();
			System.out.println("������ �Է��ϼ���");
			vo.setName(sc.next());
//			if(vo.getName().equals("0")) break;
			
			System.out.println("���������� �Է��ϼ���");
			vo.setKor(sc.nextInt());
			System.out.println("���������� �Է��ϼ���");
			vo.setEng(sc.nextInt());
			System.out.println("���������� �Է��ϼ���");
			vo.setMat(sc.nextInt());
			vo.sungjukTitle();			
			vo.sungjukCalc();
			vo.sungjukPrint();
//		}
		System.out.println("========================================================");
		
		sc.close();
	}

}
