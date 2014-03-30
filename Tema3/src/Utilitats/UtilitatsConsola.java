package Utilitats;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilitatsConsola {

public class Llegir {
			
		

		public int llegirSencer(String prompt) {
			boolean correcte = false;

			int sencer = 0;

			// L'objecte teclat representa l'entrada de dades.
			Scanner teclat = new Scanner(System.in);

			// Llegeix un sencer del teclat. Si el que introdueix l'usuari no es
			// pot
			// convertir a sencer l'avisa de l'errada i torna a demanar el
			// sencer.
			do {
				System.out.print(prompt);
				try {
					sencer = teclat.nextInt();
					correcte = true;

				} catch (InputMismatchException e) {
					System.err.println("Sencer incorrecte.");
					teclat.next();
				}
			} while (correcte == false);
			return sencer;
		}

		public String llegirCadena(String prompt) {
			boolean correcte = false;

			String cadena = "";

			// L'objecte teclat representa l'entrada de dades.
			Scanner teclat = new Scanner(System.in);

			// Llegeix un sencer del teclat. Si el que introdueix l'usuari no es
			// pot
			// convertir a sencer l'avisa de l'errada i torna a demanar el
			// sencer.
			do {
				System.out.print(prompt);
				try {
					cadena = teclat.next();
					correcte = true;

				} catch (InputMismatchException e) {
					System.err.println("Cadena incorrecte.");
					teclat.next();
				}
			} while (correcte == false);
			return cadena;
		}
	    
		public double llegirDouble(String prompt) {
			boolean correcte = false;

			double sencer = 0;

			// L'objecte teclat representa l'entrada de dades.
			Scanner teclat = new Scanner(System.in);

			// Llegeix un sencer del teclat. Si el que introdueix l'usuari no es
			// pot
			// convertir a sencer l'avisa de l'errada i torna a demanar el
			// sencer.
			do {
				System.out.print(prompt);
				try {
					sencer = teclat.nextDouble();
					correcte = true;

				} catch (InputMismatchException e) {
					System.err.println("Sencer incorrecte.");
					teclat.next();
				}
			} while (correcte == false);
			return sencer;
		}
		
}

public int llegirSencer(String prompt) {
	boolean correcte = false;

	int sencer = 0;

	Scanner teclat = new Scanner(System.in);

	do {
		System.out.print(prompt);
		try {
			sencer = teclat.nextInt();
			correcte = true;

		} catch (InputMismatchException e) {
			System.err.println("Sencer incorrecte.");
			teclat.next();
		}
	} while (correcte == false);
	return sencer;
}
	
}
