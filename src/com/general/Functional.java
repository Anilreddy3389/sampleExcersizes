package com.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Functional {

	public static void main(String[] args) {
		
		//
		List<String> inputData = new ArrayList<>();
		inputData.add("a");
		inputData.add("b");	
		inputData.add("c");
		inputData.add("a");
		inputData.add("b");
		inputData.add("d");
		
		List<String> duplicateDataList = getUniqueDataList(inputData);
		//inputData.removeAll(uniqueDataList);
		System.out.println("duplicateDataList" +  duplicateDataList);
	}

	private static List<String> getUniqueDataList(List<String> asList) {
		Map<String, Integer> elecountMap = new HashMap<>();//a-2,b2,c1,

			for(String inputdata: asList){

				if(elecountMap.containsKey(inputdata)){
					elecountMap.put(inputdata ,elecountMap.get(inputdata) + 1 );
				}else{
					elecountMap.put(inputdata ,1);
				}
				
			} 

		for(Map.Entry<String, Integer> elementsKeySet: elecountMap.entrySet()){

			if(elementsKeySet.getValue() == 1 ){
				asList.remove(elementsKeySet.getKey());

			}


		}
		
		

		return asList;

	}

}
