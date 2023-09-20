package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mapper.EmpMapper;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/emp")  /*사용자 요청이 들어오면 일단 /emp로 먼저 경로를 설정하겠다는 것(공통설정)*/
public class EmpController {
	
	@Autowired
	EmpMapper mapper;
	
	@GetMapping("/list")
	String list(HttpServletRequest request) {
		var list = mapper.selectAll();
		request.setAttribute("list", list);
		System.out.println(EmpController.class.getName()+".list()...");
		return "emp/list";
	}
}
