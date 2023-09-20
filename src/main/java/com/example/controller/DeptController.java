package com.example.controller;

import org.apache.coyote.RequestGroupInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mapper.DeptMapper;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class DeptController {
	
	@Autowired
	DeptMapper mapper;
	
	@GetMapping("/dept/list")
	String list(HttpServletRequest request) {
		String search = request.getParameter("search");
		
		var list = mapper.selectByDname(search);
		request.setAttribute("list", list);
		return "dept/list";
	}
}