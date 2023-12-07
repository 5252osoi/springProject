package com.spring.sExam.exam1207;

import java.util.Scanner;

public class CalculatorRun4 {
	public static void main(String[] args) {
		
		Calculator4VO vo = new Calculator4VO();
		CalculatorService4 service= new CalculatorService4();
		Scanner sc = new Scanner(System.in);

		int ans =0;
		
		while(true) {
			System.out.println("계산할 수를 입력해주세요(작업종료 -> 000)");
			ans=sc.nextInt();
			if(ans!=0) vo.setSu1(ans);
			else break;
			
			System.out.println("두번째 수를 입력하세요");
			vo.setSu2(sc.nextInt());
			
			service.add(vo.getSu1(),vo.getSu2());
			service.sub(vo.getSu1(),vo.getSu2());
			service.mul(vo.getSu1(),vo.getSu2());
			service.div(vo.getSu1(),vo.getSu2());

		}
		System.out.println("작업을 종료합니다.");
		sc.close();
	}
}
