package Arrays;

/**
 * Exercici 1
 * 
 * Escriviu una classe que crei un vector de 10 sencers, els inicialitzi de 1 a
 * 10 i els mostri per pantalla.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici01 {

	public void array10sencers() {

		int contador = 0;
		int numero[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		while (contador < 10) {
			System.out.println(numero[contador]);
			contador++;
		}

	}

	public static void main(String[] args) {

		Exercici01 ex01 = new Exercici01();
		ex01.array10sencers();

	}

}
