package Exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Llegir {
			
		

		/** Aquesta classe és un exemple de com llegir un sencer des del teclat.
		 * Per utilitzar-lo als vostres programes, copiau el mètode llegirSencer complet 
		 * i afferrau-lo abans del main del vostre programa.
		 * Utilitzau-lo com faig al main d'aquest exemple.
		 *
		 * @author joan
		 */
		
		    public static int llegirTeclat(String prompt) {
		        boolean correcte = false;

		        int sencer = 0;

		        //L'objecte teclat representa l'entrada de dades.
		        Scanner teclat = new Scanner(System.in);

		        //Llegeix un sencer del teclat. Si el que introdueix l'usuari no es pot 
		        //convertir a sencer l'avisa de l'errada i torna a demanar el sencer.
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
		    
		   	

		


