package com.answer1991.spring.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

public class TaskSimpleExample {
	private class MessagePrinterTask implements Runnable {
		@Override
		public void run() {
			this.printMsg();
		}

		public void printMsg() {
			System.out.println(msg);
		}
	}

	@Autowired
	private TaskExecutor executor;
	private String msg;

	public void print() {
		for (int i = 0; i < 10; i++) {
			executor.execute(new MessagePrinterTask());
		}
	}

	public TaskExecutor getExecutor() {
		return executor;
	}

	public void setExecutor(TaskExecutor executor) {
		this.executor = executor;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
