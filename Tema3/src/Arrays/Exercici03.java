package Arrays;

import Exercicis.Llegir;
import java.util.Arrays;

/**
 * Exercici 3
 * 
 * Escriviu una classe que al main tengui dos arrays de sencers.
 * 
 * 1.Escriviu un mètode que generi un array de sencers. Té com a paràmetre la
 * longitud de l'array. Utilitzau-lo al main per crear els dos arrays.
 *  
 * 2.Escriviu un mètode que compari correctament els dos arrays definits al main
 * i torni un booleà amb el resultat.
 * 
 * 3.Escriviu un altre mètode que pugui rebre dos vectors de diferent longitud i
 * els compari. Si no tenen la mateixa longitud evidentment no són iguals.
 * 
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici03 {

	public int[] generararray(int longitud) {

		int[] array = new int[longitud];

		for (int comptador = 0; comptador < array.length; comptador++) {
			array[comptador] = 1 + (int) (Math.random() * ((10 - 1) + 1));
		}
		return array;

	}

	public boolean comparararray(int[] array1, int[] array2) {
		return Arrays.equals(array1, array2);

	}

	public void compararvector(int[] vector1, int[] vector2) {
		if (vector1.length == vector2.length) {
			System.out.println("Tenen la mateixa longitut!");
			System.out.println("");
		} else {
			System.out.println("No tenen la mateixa longitut!");
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		Exercici03 ex03 = new Exercici03();
		int[] array1 = ex03.generararray(Llegir
				.llegirTeclat("Indica la longitut del primer array. "));
		int[] array2 = ex03.generararray(Llegir
				.llegirTeclat("Indica la longitut del segon array. "));

		if (ex03.comparararray(array1, array2)) {
			System.out.println("");
			System.out.println("El contingut és igual!");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("El contingut no és igual!");
			System.out.println("");
		}

		ex03.compararvector(array1, array2);

	}

}
