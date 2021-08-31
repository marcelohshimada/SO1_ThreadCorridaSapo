package controller;

public class ThreadSalto extends Thread {

	public int distMax;

	public ThreadSalto(int distMax) {
		this.distMax = distMax;
	}

	@Override // Obrigatoriedade de executar método run()
	public void run() {
		pular();
	}

	private void pular() { // Método que realiza a movimentação dos sapos
		double distPerc = 0; // Começar na posição 0

		while (distPerc < distMax) {
			// Gera números aleatórios entre 1 e 10
			int pulo = (int) ((Math.random() * 10) + 1);
			distPerc += pulo; // O número gerado é igual a distância do pulo
			System.out.println("O sapo #" + getId() + " pulou " + pulo + "m." 
			+ " e percorreu " + distPerc + "m.");
		}
		System.out.println("\n=========> O sapo #" + getId() + " chegou <=========\n");
		
	}

}
