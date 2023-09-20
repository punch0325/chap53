package com.example.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class EmpTest {

	@Test
	void build() {
		var emp1 = new Emp(1000,"김은비", null, null,null,null,null,null,null);
		var emp2 = Emp.builder().empno(1000).ename("김은비").build();
		
		System.out.println(emp1.equals(emp2));
	}
	
	
	@Test
	void equals() {
		
	}
	
	
	
	@Test
	void hashcode() {

	}
}
