package primeFactorization;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestPrimeFactor {

	@Test
	public void test1() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		assertEquals(Prime.primeFactorizationOf(1), expected);		
	}

}
