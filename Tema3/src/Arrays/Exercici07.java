package Arrays;

import Exercicis.Llegir;

/**
 * Exercici 7
 * 
 * Escriviu una classe que demani el nombre de notes d'un alumne i les guardi
 * dins un array de double. Afegiu un mètode que mostri les notes i un altre que
 * calculi la mitjana. Podeu utilitzar la classe UtilitatsTeclat per a demanar
 * les dades a l'usuari.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici07 {

	public double[] guardarNotas(double[] notas) {
		for (int comptador = 0; comptador < notas.length; comptador++) {
			notas[comptador] = Llegir
					.llegirTeclat("Indica la nota de l'alumne. ");
		}
		return notas;

	}

	public void mostrarNotas(double[] notas) {
		for (int comptador = 0; comptador < notas.length; comptador++) {
			System.out.println(notas[comptador]);
		}

	}

	public double mitjaNotas(double[] notas) {
		double mitjana = 0;
		for (int comptador = 0; comptador < notas.length; comptador++) {
			mitjana = mitjana + notas[comptador];
		}
		mitjana = mitjana / notas.length;
		return mitjana;

	}

	public static void main(String[] args) {
		double[] notas = new double[Llegir
				.llegirTeclat("Indica quantes notas. ")];

		Exercici07 ex07 = new Exercici07();
		ex07.guardarNotas(notas);
		ex07.mostrarNotas(notas);
		System.out.println("");
		System.out.println("Mitjana --> " + ex07.mitjaNotas(notas));
	}

}
