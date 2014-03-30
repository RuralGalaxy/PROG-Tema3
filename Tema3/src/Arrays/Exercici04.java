package Arrays;

/**
 * Exercici 4
 * 
 * Escriviu una classe amb un mètode que rebi un array de tres sencers i
 * l'ordeni (com a l'exercici 12 del tema anterior). Heu de comprovar que
 * l'array tengui tres posicions. Tornau un booleà, true si el podeu ordenar i
 * false en cas contrari.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici04 {

	public int[] generararray(int longitud) {

		int[] array = new int[longitud];

		for (int comptador = 0; comptador < 3; comptador++) {
			array[comptador] = 1 + (int) (Math.random() * ((10 - 1) + 1));
		}
		return array;

	}
	
	public boolean ordenararray(int[] ordenar){
		if (ordenar.length == 3){
			int temporal;
			if (ordenar[0] > ordenar[2]) {
				temporal = ordenar[0];
				ordenar[0] = ordenar[2];
				ordenar[2] = temporal;
			}
			if (ordenar[1] > ordenar[2]) {
				temporal = ordenar[1];
				ordenar[1] = ordenar[2];
				ordenar[2] = temporal;
			}
			if (ordenar[0] > ordenar[1]) {
				temporal = ordenar[1];
				ordenar[1] = ordenar[0];
				ordenar[0] = temporal;
			}
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		Exercici04 ex04 = new Exercici04();
		int[] array1 = ex04.generararray(3);
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		ex04.ordenararray(array1);
		System.out.println("");
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

		if (array1.length == 3) {
			System.out.println("Té una longitud de 3!");

		} else {
			System.out.println("No té una longitud de 3!");
		}
	}
}


