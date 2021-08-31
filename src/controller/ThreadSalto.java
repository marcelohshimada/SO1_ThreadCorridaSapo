package controller;

public class ThreadSalto extends Thread {

	public int distMax;

	public ThreadSalto(int distMax) {
		this.distMax = distMax;
	}

	@Override // Obrigatoriedade de executar m�todo run()
	public void run() {
		pular();
	}

	private void pular() { // M�todo que realiza a movimenta��o dos sapos
		double distPerc = 0; // Come�ar na posi��o 0

		while (distPerc < distMax) {
			// Gera n�meros aleat�rios entre 1 e 10
			int pulo = (int) ((Math.random() * 10) + 1);
			distPerc += pulo; // O n�mero gerado � igual a dist�ncia do pulo
			System.out.println("O sapo #" + getId() + " pulou " + pulo + "m." 
			+ " e percorreu " + distPerc + "m.");
		}
		System.out.println("\n=========> O sapo #" + getId() + " chegou <=========\n");
		
	}

}
