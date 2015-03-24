package primeFactorization;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestPrimeFactor {

	@Test
	public void test1() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		assertEquals(Prime.primeFactorizationOf(1), expected);		
	}
	@Test
	public void test2() {
		Integer[] list = {2};
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(list));
		assertEquals(Prime.primeFactorizationOf(2), expected);
	}
	
	@Test
	public void test3(){
		Integer[] list = {3};
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(list));
		assertEquals(Prime.primeFactorizationOf(3), expected);
	}
}
