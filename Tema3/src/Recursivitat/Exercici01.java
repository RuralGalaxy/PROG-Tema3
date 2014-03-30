package Recursivitat;


/**
 * Exercici 1
 * 
 * Crea una classe i comprova que l'exemple de sobrecàrrega dels apunts, el que
 * té unes quantes versions de saluda, funciona.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici01 {

	public void saluda() {
		System.out.println("Hola!");
	}

	public void saluda(String nom) {
		System.out.println("Hola " + nom + " !");
	}

	public void saluda(String nom1, String nom2) {
		System.out.println("Hola " + nom1 + " i " + nom2 + " !");
	}

	public void saluda(String nom, int dies) {
		System.out.println("Hola " + nom + " ! Feia " + dies
				+ " que no et veia!");
	}

	public static void main(String[] args) {

		Exercici01 ex01 = new Exercici01();
		ex01.saluda();
		ex01.saluda("Rafel");
		ex01.saluda("Rafel", "Guillem");
		ex01.saluda("Rafel", 2);

	}

}
