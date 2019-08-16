package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class Calctest {

	@Test
	void test() {
		assertEquals(30, Calc.sum(10, 20));
		assertEquals(14, Calc.sum(7, 7));
		assertEquals(101, Calc.sum(50, 51));
	}

}
