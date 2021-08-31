package view;

import controller.ThreadSalto;

public class Principal {

	public static void main(String[] args) {
		
		int distMax = 50; // Distância máxima e limite da corrida, o sapo que chegar a 50m primeiro ganha
		
		Thread sapo1 = new ThreadSalto(distMax);
		Thread sapo2 = new ThreadSalto(distMax);
		Thread sapo3 = new ThreadSalto(distMax);
		Thread sapo4 = new ThreadSalto(distMax);
		Thread sapo5 = new ThreadSalto(distMax);
		
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
	}
}
