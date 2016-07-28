package com.javastruct;

import java.io.IOException;

public class MatrixAdd {
	
	public static void TwoMatrixAdd(int arrA[][], int arrB[][], int arrC[][], int dimX, int dimY){
		
		int row, col;
		
		if (dimX <= 0 || dimY <= 0){
			System.out.println("�����ά���������0");
			return;
		}
		
		//��������������е�ÿһ��Ԫ�ز����
		for (row=0; row<=(dimX-1); row++){
			for (col=0; col<=(dimY-1); col++){
				arrC[row][col] = arrA[row][col] + arrB[row][col];
			}
		}
		
	}

	public static void printMatrix(int arrX[][]){
		
		int i, j;
		for (i=0; i<3; i++){
			for (j=0; j<3; j++){
				System.out.print(arrX[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		final int ROWS = 3;
		final int COLS = 3;
		
		int [][] A = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
		int [][] B = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
		int [][] C = new int [ROWS][COLS];
		
		printMatrix(A);
		System.out.println("����A��ӡ���");
		printMatrix(B);
		System.out.println("����B��ӡ���");
		
		TwoMatrixAdd(A, B, C, 3, 3);
		printMatrix(C);
		System.out.println("����C��ӡ���");
	}

}
