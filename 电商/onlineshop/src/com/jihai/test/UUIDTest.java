package com.jihai.test;

import java.util.UUID;

import org.junit.Test;

public class UUIDTest {
	@Test
	public void TestUUID() {
		System.out.println(UUID.randomUUID().getLeastSignificantBits());
	}
}
