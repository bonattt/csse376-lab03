package primeNumberGenerator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runners.*;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class TestGenerator {	
	
	int testInput;
	ArrayList<Integer> testExpected;
	
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers(){
		Integer[] p1 = {};
		Integer[] p2 = {};
		Integer[] p3 = {2};
		Integer[] p4 = {2,3};
//		Integer[] p5 = {2,3};
		return Arrays.asList(new Object [][]  {
				{1, new ArrayList<Integer>(Arrays.asList(p1))},
				{2, new ArrayList<Integer>(Arrays.asList(p2))},
				{3, new ArrayList<Integer>(Arrays.asList(p3))},
				{4, new ArrayList<Integer>(Arrays.asList(p4))}
//				{5, new ArrayList<Integer>(Arrays.asList(p5))}
		});
	}
	
	public TestGenerator (int input, ArrayList<Integer> expected) {
		testInput = input;
		testExpected = expected;
	}
	
	@Test
	public void actualTest(){
		assertEquals(testExpected, Generator.generatePrimes(testInput));
	}
	
}
