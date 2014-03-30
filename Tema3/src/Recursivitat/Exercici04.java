package Recursivitat;

/**
 * Exercici 4
 *
 * Crea un mètode que calculi el producte de a * b utilitzant sumes. Fes-ho amb una iteració.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici04 {

	public int calcularProducte(int numero1, int numero2) {
		int resultat = numero1;
		for (int index = numero2; index > 1; index--) {
			resultat = resultat + numero1;
		}
		return resultat;
	}

	public static void main(String[] args) {

		Exercici04 ex03 = new Exercici04();
		System.out.println("Total = " + ex03.calcularProducte(3, 5));

	}

}
