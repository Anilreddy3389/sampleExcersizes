package com.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new HashMap<>();
		hm.put("a1", 1000);
		hm.put("a2", 5000);
		hm.put("a3", 500);
		
		hm.put("a4", 1500);
		hm.put("a5", 1000);
		hm.put("a6", 6000);
		Map<String, Integer> updatedHm = new LinkedHashMap<>();
		updatedHm = hm.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e1, LinkedHashMap:: new));
		//hm = sortByValues1(hm);
		System.out.println("sortByValues::"+ updatedHm);

	}

private static Map<String, Integer> sortByValues1(Map<String, Integer> hm) {
	
	List<Map.Entry<String, Integer>> li = new LinkedList<>(hm.entrySet());
	
	//hm.entrySet().stream().sorted(Map.Entry.comparingByValue());
	
	Collections.sort(li, new Comparator<Map.Entry<String, Integer>>() {
		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
			return o2.getValue().compareTo(o1.getValue());
		}
	});
	
	Map<String, Integer> sortedHm = new LinkedHashMap<>();
	for(Entry<String, Integer> data: li) {
		sortedHm.put(data.getKey(), data.getValue());
	}

	
	return sortedHm;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static Map<String, Integer> sortByValues(Map<String, Integer> hm) {
		
		List<Map.Entry<String, Integer>> li = new LinkedList<>(hm.entrySet());
		
		Collections.sort(li, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		Map<String, Integer> sortedHm = new LinkedHashMap<>();
		for(Entry<String, Integer> data: li) {
			sortedHm.put(data.getKey(), data.getValue());
		}
		
		return sortedHm;
		
	}

}
