package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.model.Emp;

@Mapper
public interface EmpMapper {
	
	@Select("select * from emp")
	List<Emp> selectAll();
	
	
	@Select ("select * from emp where deptno= #{deptno}")
																		// 매개변수 deptno가 Integer타입이라 #을 이용하여 쿼리문에 넣어준 것
	List<Emp> selectByDeptno(Integer deptno);
}
