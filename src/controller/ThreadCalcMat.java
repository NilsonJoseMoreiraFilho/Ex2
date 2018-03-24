package controller;

public class ThreadCalcMat extends Thread {
	private int linha; 
	private int[] valores = new int[5];
	
	
	public ThreadCalcMat(int linha, int[] valores) {
		this.linha = linha; 
		this.valores=valores;
		
	
		
	}
	@Override
	public void run() {
		int soma = 0;
		for (int i = 0; i<5; i++) {
			soma += valores [i];
		}
		System.out.println(linha+ " - " + soma );
		soma = 0; 
	}
	
	
}