package com.ibm.Akhya;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][]=new int[2][3];
		num[0][1]= 2;
		num[0][2]= 3;
		num[0][0]= 1;
		num[1][1]= 5;
		num[1][2]= 6;
		num[1][0]= 4;

		for(int i=0 ; i< 2;i++){
			for(int j=0; j<3 ; j++) {
		
					System.out.print( " "+num[i][j]);
			}
			System.out.println();
		}
		
		for(int i[] : num){
			for(int j: i) {
		
				System.out.print( " "+j);
			}
		}
	}

}
