package com.answer1991.spring.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
public class ScheduleSimpleExample {
	@Autowired
	private TaskScheduler scheduler;
	
	private static class PrintTask implements Runnable {
		@Override
		public void run() {
			System.out.println("task executed!");
		}
	}
	
	public void startSchedule() {
		scheduler.schedule(new PrintTask() , new CronTrigger("0/10 * * * * ?"));
	}
}
