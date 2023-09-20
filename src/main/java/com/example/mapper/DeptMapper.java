package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.model.Dept;

@Mapper
public interface DeptMapper {
	
	@Select("select * from dept")
	List<Dept> selectAll();
	
	@Select("SELECT * FROM DEPT WHERE DNAME LIKE '%${search}%' ")
	List<Dept> selectByDname(String search);
}
