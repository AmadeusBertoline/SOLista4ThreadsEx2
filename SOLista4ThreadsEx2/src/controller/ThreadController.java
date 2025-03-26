package controller;

public class ThreadController extends Thread {

	private int[] vetor;

	public ThreadController(int[] vetor) {
		this.vetor = vetor;
	}

	@Override
	public void run() {
		
		int soma = 0;
		
		for(int i = 0; i <= vetor.length - 1; i++) {
			
			soma = vetor[i] + soma;
			
		}
		
		System.out.println(Thread.currentThread().getId() + " -> " + soma);
		
	}
	
}
