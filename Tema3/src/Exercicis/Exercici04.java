package Exercicis;

/**
 * Exercici 4
 *   
 * Realitzau un programa que mostri les següents opcions:
 * 
 * 1.Mostrar la taula de multiplicar d'un nombre donat.
 * 2.Mostrar els divisors d'un nombre. 
 * 3.Calcular el factorial d'un nombre. 
 * 4.Comprovar si un nombre és primer o no. 
 * 5.Acabar.
 * 
 * Per a cada una d'elles heu de crear un mètode que faci els càlculs
 * necessaris.
 * 
 * El main s'encarregarà de mostrar les opcions, llegir la que ha pitjat
 * l'usuari i per a cada una llegir les dades necessàries i passar-les al mètode
 * adequat.
 * 
 * Per llegir sencers podeu utilitzar la plantilla PlantillaLlegirSencers.
 * 
 * Els mètodes que implementin les dues darreres opcions no han de mostrar res
 * per pantalla, han de tornar el valor adequat i que sigui el main el que ho
 * mostri.
 * 
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici04 {

	public void multiplicar(int numero1) {

		int resultat;

		for (int nombre = 1; nombre <= 10; nombre++) {
			resultat = nombre * numero1;
			System.out.println(nombre + " x " + numero1 + " = " + resultat);
			System.out.println("");
		}

	}

	public void divisors(int numero1) {

		int divisor = 1;
		while (divisor <= numero1) {

			if (numero1 % divisor == 0)
				System.out.println(divisor);
			divisor++;
		}

	}

	public void comparador(int numero1) {

		int contador = 1;
		int resultat = 1;

		while (contador <= numero1) {
			resultat = resultat * contador;
			contador++;
		}
		System.out.println(resultat);
		System.out.println("");

	}

	public void primers(int numero1) {

		int increment = 2;

		while ((numero1 % increment) != 0) {
			increment = increment + 1;
		}

		if (numero1 == increment) {
			System.out.println("És primer!");
			System.out.println("");
		} else {
			System.out.println("No és primer!");
			System.out.println("");

		}

	}

	public static void main(String[] args) {
		Exercici04 objecte = new Exercici04();
		int menu;
		do {
			System.out.println("===MENU===");
			System.out.println("");
			System.out
					.println("1. Mostrar la taula de multiplicar d'un nombre donat.");
			System.out.println("2. Mostrar els divisors d'un nombre.");
			System.out.println("3. Calcular el factorial d'un nombre.");
			System.out.println("4. Comprovar si un nombre és primer o no.");
			System.out.println("5. Sortir.");
			System.out.println("");
			menu = Llegir.llegirTeclat("Pitja el número de l'opció desitjada:");

			switch (menu) {
			case 1:
				int a1 = Llegir.llegirTeclat("Indica el nombre per operar.");
				objecte.multiplicar(a1);
				break;
			case 2:
				int b1 = Llegir.llegirTeclat("Indica el nombre per operar.");
				objecte.divisors(b1);
				break;
			case 3:
				int c1 = Llegir.llegirTeclat("Indica el nombre per operar.");
				objecte.comparador(c1);
				break;
			case 4:
				int d1 = Llegir.llegirTeclat("Indica el nombre per operar.");
				objecte.primers(d1);
				break;

			default:
				break;
			}

		} while (menu != 5);

		System.out.println("");
		System.out.println("Ja pots apagar el programa! ADÉU ;)");

	}

}
