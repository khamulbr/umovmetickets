package com.alessandrovdias.umovmetickets.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void testRoundReallyNear() {
		Double expected = new Double(3.7);
		assertEquals(expected, Utils.roundUp(new Double(3.69999)));
	}

	@Test
	public void testRoundNotSoNear() {
		Double expected = new Double(3.7);
		assertEquals(expected, Utils.roundUp(new Double(3.695)));
	}

	@Test
	public void testRoundNotNear() {
		Double expected = new Double(3.7);
		assertEquals(expected, Utils.roundUp(new Double(3.691)));
	}

}
