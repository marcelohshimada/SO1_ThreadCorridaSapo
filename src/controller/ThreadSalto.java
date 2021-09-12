package controller;

public class ThreadSalto extends Thread {

	private int idSapo;
	private int distMax = 50;
	private double distPerc = 0;
	private static int posicao = 0;

	public ThreadSalto(int idSapo) {
		this.idSapo = idSapo;
	}

	@Override // Obrigatoriedade de executar m�todo run()
	public void run() {
		pular();
	}

	private void pular() { // M�todo que realiza a movimenta��o dos sapos

		while (distPerc < distMax) {
			// Gera n�meros aleat�rios entre 1 e 10
			int pulo = (int) ((Math.random() * 10) + 1);
			distPerc += pulo; // O n�mero gerado � igual a dist�ncia do pulo
			System.out.println("O sapo " + idSapo + " pulou " + pulo + "m" + " e j� percorreu " + distPerc + "m");

			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		posicao++;
		System.out.println("\n=====> O sapo " + idSapo + " foi o " + posicao + "� a chegar <======\n");

	}

}
