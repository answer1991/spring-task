package com.answer1991.spring.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTaskSimpleExample {
	@Autowired
	private TaskSimpleExample taskExample;
	
	@Test
	public void testRun() {
		taskExample.print();
	}
}
