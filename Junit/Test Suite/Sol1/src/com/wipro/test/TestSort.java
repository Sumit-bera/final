package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

	@Test
	public void test() {
		 DailyTasks dt = new DailyTasks();
		int a[]= {1,2,3,4,5};
	    int b[]= {1,2,3,4,5};
	    assertArrayEquals(a, dt.sortValues(b));
	}

}
