package Recursivitat;

/** Exercici 6
 * 
 * Escriu un mètode que calculi el terme n-essim de la sèrie de Fibonacci de forma recursiva. 
 * Des del main crida aquest mètode per a mostrar els 10 primers termes de la successió.
 *   
 * @author Rafel Sastre Mas
 * 
 */

public class Exercici06 {

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
		Exercici06 ex03 = new Exercici06();
		for (int index = 0; index < 10; index++) {
			System.out.print(ex03.fibonacci(index) + " ");
		}

	}

}
