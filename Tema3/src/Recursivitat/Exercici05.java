package Recursivitat;

/** Exercici 5
 * 
 * Repeteix el problema anterior de forma recursiva.
 * 
 * @author Rafel Sastre Mas
 * 
 */

public class Exercici05 {

	public int calcularProducte(int numero1, int numero2) {
		int resultat = numero1;
		if (numero2 == 1) {
			return resultat;
		} else {
		resultat = resultat + calcularProducte(numero1, numero2 -1);
		}
		return resultat;
	}

	public static void main(String[] args) {

		Exercici05 ex03 = new Exercici05();
		System.out.println("Total = " + ex03.calcularProducte(3, 5));

	}

}
