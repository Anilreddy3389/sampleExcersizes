package com.general;

public class MaxtrixPrint {

	public static void main(String[] args) {
		
		printSnackMatrix(4, 4);

		
	}

	private static void printSnackMatrix(int i, int j) {
		
		int row = i;
		int column = j;
		int num = i * j;
		int temp = -1;
		
		for (int k = 1; k <= row; k++) {
			
			for(int m = 1 ; m <= column ; m++) {
				System.out.print( num +"\t");
				num = num + temp ;
			}
			System.out.println("\n");
			if(k%2 == 0) {
				num = num - column - 1 ;
				temp = -1;
			}else {
				num = num - column + 1 ;
				temp = +1;
			}
		}
		
	}

}
