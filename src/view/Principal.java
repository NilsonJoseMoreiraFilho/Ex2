package view;

import java.util.Random;

import controller.ThreadCalcMat;

public class Principal {
	
	public static void main(String[] args) {
		Random gerador = new Random();
		int[][] matriz = new int[3][5];
		int[] aux= new int [5] ;			
		
		for(int i=0; i<3; i++) {
			for(int x=0 ; x<5; x++) {
				matriz[i][x]= gerador.nextInt(100);
			}
		}
		
		for(int i= 0; i<3; i++) {
			for (int j = 0; j < 5; j++) {
				aux[j]= matriz[i][j];
			}
			Thread thread = new ThreadCalcMat((i+1), aux);
			thread.start();
		}
		
	}

}
