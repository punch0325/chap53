package com.example.mapper;
                                         /* 테스트 클래스 역시 패키지를 동일하게 해준다.*/

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.isNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest /*스프링 부트의 기능을 쓰기 위해서 어노테이션으로 추가해줌*/
public class DeptMapperTest {
	
	@Autowired /*스프링 부트의 기능 중 하나(spring di). 자동으로 해당 Mapper를 찾아서 연결해준다.(의존성 주입)*/
	DeptMapper mapper;
	
	@Test
	void autowire() {
		assertThat(mapper).isNotNull();
	}
	
	@Test
	void selectAll() {
		var list = mapper.selectAll();

		System.out.println(list);
		
		assertThat(list).isNotNull();
		assertThat(list).isNotEmpty();
		assertThat(list.size()).isGreaterThan(0);
	}
	
	@Test
	void selectByName() {
		var list = mapper.selectByDname("null");
		assertThat(list).isNotNull();
//		assertThat(list.size()).isGreaterThan(0);
		
//		list = mapper.selectByDname("");
//		assertThat(list).isNotNull();
//		assertThat(list.size()).isGreaterThanOrEqualTo(0);
//		
//		list = mapper.selectByDname("부");
//		assertThat(list).isNotNull();
//		assertThat(list.size()).isGreaterThanOrEqualTo(4);
	}
}
