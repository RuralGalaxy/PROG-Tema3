package Exercicis;

/**
 * Exercici 6
 * 
 * Crea una classe amb un mètode que ordeni tres variables de tipus sencer
 * (anomenades a, b i c), de manera que al final el valor més petit estigui dins
 * la a i el major dins la c. Mostra amb un println els problemes amb els que
 * t'hagis pogut trobar i com els has solucionat.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici06 {

	public void ordenar(int a, int b, int c) {

		int temporal;

		if (a > c) {
			temporal = a;
			a = c;
			c = temporal;
		}
		if (b > c) {
			temporal = b;
			b = c;
			c = temporal;
		}
		if (a > b) {
			temporal = b;
			b = a;
			a = temporal;
		}

		System.out.println(a + "<=" + b + "<=" + c);

	}
	
	public static void main(String[] args) {
	
		Exercici06 objecte = new Exercici06();
		int a1 = Llegir.llegirTeclat("Indica el primer nombre per operar.");
		int b1 = Llegir.llegirTeclat("Indica el segon nombre per operar.");
		int c1 = Llegir.llegirTeclat("Indica el tercer nombre per operar.");
		objecte.ordenar(a1, b1, c1);

	}

}
