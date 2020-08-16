package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;


import principal.Solucoes;

class TesteNumeroIrmao {

	@Test
	void test() {
		String data = "1234";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		Solucoes s = new Solucoes();
		assertEquals(4321, s.solution(scanner.nextInt()));
	}
	
	@Test
	void test1() {
		String data = "31231";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		Solucoes s = new Solucoes();
		assertEquals(33211, s.solution(scanner.nextInt()));
	}
	
	@Test
	void test3() {
		String data = "353";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		Solucoes s = new Solucoes();
		assertEquals(533, s.solution(scanner.nextInt()));
	}
	
	@Test
	void test4() {
		String data = "100000000";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		Solucoes s = new Solucoes();
		assertEquals(-1, s.solution(scanner.nextInt()));
	}

}
