package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class JunitTest2 {

	/*junit 테스트를 실행시키기 위함. 메소드 이름에 커서를 두고 ctrl+F11 junit으로 실행*/
	@Test
	void test1() {
		System.out.println("test1()...");
		
		int num = 10/0;
		
		System.out.println("End...");
		
	}
	
	
	@Test
	void test2() {
		System.out.println("test2()...");
		
		int num = 100;
		assertThat(num).isEqualTo(200);
		
	
	}
	
	
	@Test
	void test3() {
		int sum = 0;
		
		for(int i=1; i<10; i++) {
			sum += i;
		}
		
		assertThat(sum).isEqualTo(45);
//     오류를 찾기 위한 방법. 코드의 예상 값이 55일 때, assertThat을 통하여 예상 값과 실제 값이 맞는지 비교해보는 것
//		예상 값이 틀렸으면 Junit에 에러가난다.
	}


}
