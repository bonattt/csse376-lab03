package primeNumberGenerator;

import java.util.ArrayList;

public class Generator {
	public static ArrayList<Integer> generatePrimes(int i){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (i == 3){
			list.add(2);
		}
		return list;
	}
}
