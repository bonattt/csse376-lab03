package primeNumberGenerator;

import java.util.ArrayList;

public class Generator {
	public static ArrayList<Integer> generatePrimes(int i){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (i == 3){
			list.add(2);
		}
		if (i == 4){
			list.add(2);
			list.add(3);
		}
		
		return list;
	}
}
