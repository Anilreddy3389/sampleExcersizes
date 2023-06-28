package com.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Commonproblems {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean vowel = isVowelContains("wn");
		System.out.println("vowel::"+ vowel);
		//5 -> 3+4
		long fiboniSeries = getFibonicSeries(5);
		System.out.println("fiboniSeries:::"+ fiboniSeries);
		List<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(8);
		number.add(4);
		number.add(8);
		number.add(4);
		 List<Integer> collect = number.stream().sorted(Comparator.reverseOrder())
				 
				 .distinct().collect(Collectors.toList());
		System.out.println("ex:::"+ collect.get(1));
		
		String input = "i love my familyy";
		
		String result = Arrays.asList(input.split(" ")).stream()
				.reduce((w1,w2)-> w1.length()>w2.length() ? w1 : w2)
				.get();
		System.out.println("result::"+ result);		
		
		
	}
	

	private static long getFibonicSeries(int input) {
		
		int a =0;
		int b =1 ;
		int c =1;
		for(int i=1; i < input ; i++) {
			a = b;
			b = c;
			c =a+ b;
		}
		return c;
	}

	private static boolean isVowelContains(String input) {
		return input.toLowerCase().matches(".*[^aeiou].*");
		
		
		
	}

}
