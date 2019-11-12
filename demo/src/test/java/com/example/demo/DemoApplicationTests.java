package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	//다른패키지에서 참조하기 위해 public class로 설정하고, public void contextLoad()로 설정한다.
	//그렇지 않으면 에러가 발생.
	//setting에서 build -> gradle을 intellj로 변경.
	//setting에서 annotation을 설정.
	@Test
	public void contextLoads() {
	}

}
