package com.example.model;

import lombok.Data;

@Data  /*롬복의 기능 중 하나. 게터, 세터, equals, toString, 기본 생성자 등등을 만들어 줌*/
public class Dept {
	Integer deptno;
	String dname;
	String loc;
}
