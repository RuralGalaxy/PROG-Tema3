package Recursivitat;

/**
 * Exercici 3
 *
 * Calcula el factorial de n de forma recursiva. 5!=5*4!
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici03 {

	public int calcularFactorial(int numero) {
		System.out.println(numero);
		if (numero == 1) {
			return numero;
		} else {
			numero = numero * calcularFactorial(numero - 1);
			}
		return numero;
	}

	public static void main(String[] args) {

		Exercici03 ex03 = new Exercici03();
		System.out.println("Total = " +ex03.calcularFactorial(3));

	}

}
