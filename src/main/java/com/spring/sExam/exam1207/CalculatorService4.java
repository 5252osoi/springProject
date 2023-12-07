package com.spring.sExam.exam1207;

public class CalculatorService4 {
	
	public void add(int su1, int su2) {
		System.out.println(su1+" + "+su2+" = "+(su1+su2));
	}
	public void sub(int su1, int su2) {
		System.out.println(su1+" - "+su2+" = "+(su1-su2));
	}
	public void mul(int su1, int su2) {
		System.out.println(su1+" x "+su2+" = "+(su1*su2));
	}
	public void div(int su1, int su2) {
		if(su2!=0) {
			System.out.println(su1+" / "+su2+" = "+(su1/su2));
		} else System.out.println("나눗셈의 분모가 0 일 수 없습니다.");
	}
	
}
