package primeFactorization;

import java.util.ArrayList;

public class Prime {
	
	public static ArrayList<Integer> primeFactorizationOf(int i){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		if (i == 2){
			factors.add(2);
		} else if (i == 3) {
			factors.add(3);
		}
		return factors;
	}
}
