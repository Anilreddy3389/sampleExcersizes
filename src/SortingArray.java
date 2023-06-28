public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {4,7,3,6,5,9,3};
		
		inputArray = sortArray(inputArray);
		System.out.println("inputArray:::"+ inputArray);
		
		int[] segregateArray = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0} ;
		segregateArray = sortArray(segregateArray);//(segregateArray);
		System.out.println("segregateArray:::"+ segregateArray);
	}

	private static int[] segregateTheArray(int[] segregateArray) {
		
		return null;
	}

	private static int[] sortArray(int[] inputArray) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < inputArray.length; i++) {
			
			for (int j = i+1; j < inputArray.length; j++) {
				
				if(inputArray[i] > inputArray[j]) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
	}

}
