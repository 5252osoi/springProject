package com.spring.sExam.exam1207;

import java.util.Scanner;

public class CalculatorRun3 {
	public static void main(String[] args) {
		Calculator2 calc = new Calculator2(100,50);
		Scanner sc = new Scanner(System.in);
		//calc.setSu1(100);
		//calc.setSu2(50);
		System.out.println("계산할 su1과 su2를 각각 입력해주세요");
		int su1=sc.nextInt();
		int su2=sc.nextInt();
		
		calc.setSu1(su1);
		calc.setSu2(su2);
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
		
		sc.close();
	}
}
