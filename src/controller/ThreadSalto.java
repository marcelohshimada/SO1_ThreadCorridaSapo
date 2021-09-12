package controller;

public class ThreadSalto extends Thread {

	private int idSapo;
	private int distMax = 50;
	private double distPerc = 0;
	private static int posicao = 0;

	public ThreadSalto(int idSapo) {
		this.idSapo = idSapo;
	}

	@Override // Obrigatoriedade de executar método run()
	public void run() {
		pular();
	}

	private void pular() { // Método que realiza a movimentação dos sapos

		while (distPerc < distMax) {
			// Gera números aleatórios entre 1 e 10
			int pulo = (int) ((Math.random() * 10) + 1);
			distPerc += pulo; // O número gerado é igual a distância do pulo
			System.out.println("O sapo " + idSapo + " pulou " + pulo + "m" + " e já percorreu " + distPerc + "m");

			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		posicao++;
		System.out.println("\n=====> O sapo " + idSapo + " foi o " + posicao + "º a chegar <======\n");

	}

}
