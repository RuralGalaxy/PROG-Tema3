package Arrays;

/**
 * Exercici 6
 * 
 * Creau una classe que defineixi una matriu quadrada, pe 4x4, i un mètode per a
 * cada una d'aquestes opcions. Cridau-los tots des del main, no cal programar
 * cap menú.
 * 
 * Inicialitzau-la de forma que cada casella tengui la suma de les seves
 * coordenades.
 * 
 * Mostrau la matriu, si potser de forma ordenada.
 * Mostrau la diagonal principal, [1,1], [2,2]...
 * Mostrau la diagonal secundària [4,1][3,2]...
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici06 {

	public int[][] generarmatriu() {

		int[][] numero = new int[4][4];

		for (int contador1 = 0; contador1 < 4; contador1++) {
			for (int contador2 = 0; contador2 < 4; contador2++) {
				numero[contador1][contador2] = contador1 + contador2;
				System.out.print(numero[contador1][contador2]);
			}
			System.out.println();
		}
		System.out.println();

		for (int contador1 = 0; contador1 < 4; contador1++) {
			System.out.print(numero[contador1][contador1]);
		}

		System.out.println();

		for (int contador1 = 0, contador2 = 3; contador2 >= 0; contador1++, contador2--) {
			System.out.print(numero[contador1][contador2]);
		}
		return numero;
	}

	public static void main(String[] args) {

		Exercici06 ex06 = new Exercici06();
		int[][] array1 = ex06.generarmatriu();

	}

}
