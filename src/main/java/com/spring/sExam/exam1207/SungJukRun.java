package com.spring.sExam.exam1207;

import java.util.Scanner;

public class SungJukRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SungjukVO vo = new SungjukVO();;

		
//		while(true) {
			vo=new SungjukVO();
			System.out.println("성명을 입력하세요");
			vo.setName(sc.next());
//			if(vo.getName().equals("0")) break;
			
			System.out.println("국어점수를 입력하세요");
			vo.setKor(sc.nextInt());
			System.out.println("영어점수를 입력하세요");
			vo.setEng(sc.nextInt());
			System.out.println("수학점수를 입력하세요");
			vo.setMat(sc.nextInt());
			vo.sungjukTitle();			
			vo.sungjukCalc();
			vo.sungjukPrint();
//		}
		System.out.println("========================================================");
		
		sc.close();
	}

}
