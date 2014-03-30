package Exercicis;

/**
 * Exercici 3
 * 
 * Realitzau un programa que mostri les seg�ents opcions.
 * 
 * 1.Trobar el major de dos sencers.
 * 2.Trobar el major de tres sencers. 
 * 3.Mostrar la relaci� entre dos sencers a<b o a=b o a> b. 
 * 4.Acabar.
 * 
 * Per a cada una d'elles heu de crear un m�tode que faci els c�lculs
 * necessaris. El main s'encarregar� de
 * 
 * Mostrar les opcions. 
 * Llegir la que ha pitjat l'usuari. 
 * Per a cada opci� llegir les dades necess�ries. 
 * Cridar al m�tode adequat passant-li les dades necess�ries com a par�metres.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici03 {

	public void majordos(int numero1, int numero2) {

		if (numero1 > numero2) {
			System.out.println("");
			System.out.println(numero1 + " �s el major!");
			System.out.println("");
		} else if (numero2 > numero1) {
			System.out.println("");
			System.out.println(numero2 + " �s el major!");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("S�n iguals!");
			System.out.println("");

		}

	}

	public void majortres(int numero1, int numero2, int numero3) {

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("");
			System.out.println(numero1 + " �s el major!");
			System.out.println("");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("");
			System.out.println(numero2 + " �s el major!");
			System.out.println("");
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("");
			System.out.println(numero3 + " �s el major!");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("S�n iguals!");
			System.out.println("");

		}

	}

	public void comparador(int numero1, int numero2) {

		if (numero1 > numero2) {
			System.out.println("");
			System.out.println(numero1 + " > " + numero2);
			System.out.println("");
		}

		else if (numero2 > numero1) {
			System.out.println("");
			System.out.println(numero2 + " > " + numero1);
			System.out.println("");
		}

		else {
			System.out.println(numero1 + " = " + numero2);
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		Exercici03 objecte = new Exercici03();
		int menu;
		do {
			System.out.println("===MENU===");
			System.out.println("");
			System.out.println("1. Trobar el major de dos sencers.");
			System.out.println("2. Trobar el major de tres sencers.");
			System.out.println("3. Mostrar la relaci� entre dos sencers.");
			System.out.println("4. Sortir.");
			System.out.println("");
			menu = Llegir.llegirTeclat("Pitja el n�mero de l'opci� desitjada:");

			switch (menu) {
			case 1:
				int a1 = Llegir
						.llegirTeclat("Indica el primer nombre per operar.");
				int b1 = Llegir
						.llegirTeclat("Indica el segon nombre per operar.");
				objecte.majordos(a1, b1);
				break;
			case 2:
				int c1 = Llegir
						.llegirTeclat("Indica el primer nombre per operar.");
				int d1 = Llegir
						.llegirTeclat("Indica el segon nombre per operar.");
				int e1 = Llegir
						.llegirTeclat("Indica el tercer nombre per operar.");
				objecte.majortres(c1, d1, e1);
				break;
			case 3:
				int f1 = Llegir
						.llegirTeclat("Indica el primer nombre per operar.");
				int g1 = Llegir
						.llegirTeclat("Indica el segon nombre per operar.");
				objecte.majordos(f1, g1);
				break;

			default:
				break;
			}

		} while (menu != 4);

		System.out.println("");
		System.out.println("Ja pots apagar el programa! AD�U ;)");

	}

}
