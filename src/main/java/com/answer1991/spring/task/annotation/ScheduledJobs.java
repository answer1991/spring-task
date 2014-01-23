package com.answer1991.spring.task.annotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledJobs {
	@Scheduled(fixedRate = 5000)
	public void doEvery5Seconds() {
		System.out.println("hello");
	}
}
