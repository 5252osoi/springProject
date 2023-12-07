package com.spring.sExam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ctom")
public class CtomController {
	@RequestMapping(value="/c1",method = RequestMethod.GET)
	public String c1Get(@RequestParam(name="flag", defaultValue = "", required = false) String flag) {
		if(flag.equals("OK")) {
			System.out.println("c1Service2�� ���� �Խ��ϴ�.");
		}
		return "ctom/c1";
	}
	
	@RequestMapping(value="/c1Service",method = RequestMethod.GET)
	public String c1ServiceGet() {
		System.out.println("c1Service�Դϴ�.");
		System.out.println("�۾����Դϴ�.");
		System.out.println(".");
		System.out.println(". . ");
		System.out.println(". . . ");
		System.out.println(". . . . ");
		System.out.println(". . . . .");
		System.out.println("�۾� �Ϸ�.");
//		return "ctom/c1";
		return "redirect:/ctom/c1";
	}
	
	@RequestMapping(value="/c1Service2",method = RequestMethod.GET)
	public String c1Service2Get() {
		System.out.println("c1Service2�Դϴ�.");
		System.out.println("�۾����Դϴ�.");
		System.out.println(".");
		System.out.println(". . ");
		System.out.println(". . . ");
		System.out.println(". . . . ");
		System.out.println(". . . . .");
		System.out.println("�۾� �Ϸ�.");
		
		return "redirect:/ctom/c1?flag=OK";
	}
	
}
