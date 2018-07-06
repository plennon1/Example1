package com.example.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.one.Example1;

public class TestExample1 {

	Example1 testing;
	@Before
	public void setUp() throws Exception {
		testing = new Example1();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
	}

}
