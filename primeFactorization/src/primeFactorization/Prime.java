package primeFactorization;

import java.util.ArrayList;

public class Prime {
	
	public static ArrayList<Integer> primeFactorizationOf(int i){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		while (i%2 == 0){
			factors.add(2);
			i= i/2;
		} while (i%3 == 0) {
			factors.add(3);
			i = i/3;
		}
		return factors;
	}
}
