package Recursivitat;

/** Exercici 7
 *
 * Copia l'exercici anterior i modifica'l de forma que el m�tode que calcula el terme n-�ssim
 * mostri per pantalla el terme que est� calculant, n. Executa el programa.
 * Creus que �s eficient?
 *   
 * @author Rafel Sastre Mas
 * 
 */

public class Exercici07 {

	public int fibonacci(int numero) {
		if (numero == 1) {
			return 1;

		} else if (numero == 0) {
			return 0;
		} else {

			numero = (fibonacci(numero - 1) + fibonacci(numero - 2));
			return numero;
		}

	}

	public static void main(String[] args) {
		Exercici07 ex03 = new Exercici07();
		for (int index = 0; index < 10; index++) {
			System.out.print(ex03.fibonacci(index) + " ");
		}

	}

}
