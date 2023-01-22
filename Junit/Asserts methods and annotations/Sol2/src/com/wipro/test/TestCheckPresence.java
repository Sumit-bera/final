package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

	@Test
	public void test() {
		DailyTasks dt = new DailyTasks();
		assertTrue(dt.checkPresence("Hello", "lo"));
		assertFalse(dt.checkPresence("Hello", "pp"));
	}

}
