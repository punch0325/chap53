package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.util.Alpha;
import com.example.util.Color;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class AlphaController {
	
	@GetMapping("/alpha")
	String alpha(HttpServletRequest request) {
						  /* jsp에  */
		Alpha[][] alphas = new Alpha[20][40];
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<40; j++) {
				alphas[i][j] = new Alpha();
			}
		}
		
		request.setAttribute("alphas", alphas);
		
		return "alpha";
	}
	
	@GetMapping("/alpha2")
	String alpha2(Integer line, Integer col, Character ch, HttpServletRequest request) {
		System.out.println("[ line = "+line+",  col = "+col+",  ch = "+ch+" ]");
		
		Alpha[][] alphas = new Alpha[20][40];
		for(int i=0; i<20; i++) {
			for(int j=0; j<40; j++) {
				alphas[i][j] = new Alpha();
				alphas[i][j].setFg(Color.Black);
				alphas[i][j].setBg(Color.Black);
			}
		}

		if(line != null && col != null && ch != null) {
			var alpha = new Alpha();
			
			alpha.setLine(line);
			alpha.setCol(col);
			alpha.setCh(ch);
			
			alphas[line-1][col-1] = alpha;
			
		}
		
		String[] chs = new String[26];
		for(int i = 0; i<26; i++) {
			chs[i] = (char)('A'+i)+"";
		}

		request.setAttribute("alphas", alphas);
		request.setAttribute("chs", chs);
		request.setAttribute("colors", Color.values());
		
		
		return "alpha2";
	}
}
