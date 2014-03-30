package Arrays;
import Utilitats.UtilitatsConsola;


/**
 * Exercici 9
 *
 * Tenim un hotel amb 20 habitacions, on les habitacions estan anomenades per lletres. 
 * Per a cada habitacio volem saber quantes places t� i a quina planta es troba.
 * Utilitzarem un vector noms per el nom de les habitacions(1 vector de caracters) i 
 * una matriu dades de sencers de 20 files(1 per habitacio) i 2 columnes( 
 * la primera per les places i la segona per la planta. Aixo si noms[1]=B dades[1][0] 
 * son les places de l'habitacio B i dades[1][1] es la planta on es troba l'habitacio.
 * 
 * Creau un metode que inicialitzi la informacio dels vectors. Si voleu podeu utilitzar Math.random();
 * Feis un metode que mostri la llista de les habitacions amb tota la informacio: nom, places i planta.
 * Creau un metode que mostri el nom de totes les habitacions d'una determinada planta,
 * passant-la com a parametre.
 *  
 * Escriviu un  metode que ens digui quantes habitacions tenim d'un determinat nombre de places
 * i quines son.
 * Afegiu ara un vector de booleans que indiquin si les habitacions estan ocupades o no.
 * Volem saber les habitacions d'un nombre determinat de places que tenim buides.
 * Si no n'hi ha cap ens ha d'avisar.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici09 {
	public void omplir(int[][] dades, String[] noms, boolean[] ocupacio) {
		char letra = 'A';
		for (int contador = 0; contador < noms.length; contador++, letra++) {
			noms[contador] = (letra + "");
			dades[contador][0] = 1 + (int) (Math.random() * ((6 - 1) + 1));
			dades[contador][1] = 0 + (int) (Math.random() * ((2 - 0) + 1));
			if ((0 + (int) (Math.random() * ((1 - 0) + 1))) == 0) {
				ocupacio[contador] = false;
			} else {
				ocupacio[contador] = true;
			}
		}

	}

	public void mostrarTot(int[][] dades, String[] noms, boolean[] ocupacio) {
		for (int contador = 0; contador < noms.length; contador++) {
			System.out.print("La habitació " + noms[contador]
					+ " és a la planta " + dades[contador][1]
					+ " amb capacitat per " + dades[contador][0]
					+ " persones. ");
			if (ocupacio[contador]) {
				System.out.println("Ocupada");
			} else {
				System.out.println("Lliure");
			}

		}

	}

	public void mostrarHabitacionsPlanta(int[][] dades, String[] noms,
			boolean[] ocupacio) {
		UtilitatsConsola utilitats = new UtilitatsConsola();
		int planta;
		do {
			planta = utilitats.llegirSencer("Quina planta?");
		} while ((planta <= 0) && (planta >= 3));
		for (int contador = 0; contador < noms.length; contador++) {
			if (dades[contador][1] == planta) {
				System.out.print("La habitació " + noms[contador]
						+ " és a la planta " + dades[contador][1]
						+ " amb capacitat per " + dades[contador][0]
						+ " persones. ");
				if (ocupacio[contador]) {
					System.out.println("Ocupada");
				} else {
					System.out.println("Lliure");
				}
			}

		}

	}

	public void mostrarHabitacionsPlaça(int[][] dades, String[] noms,
			boolean[] ocupacio) {
		UtilitatsConsola utilitats = new UtilitatsConsola();
		int plaça;
		do {
			plaça = utilitats
					.llegirSencer("Quantes places desitjau? (Màxim 6)");
		} while ((plaça < 1) && (plaça > 6));
		for (int contador = 0; contador < noms.length; contador++) {
			if (dades[contador][0] == plaça) {
				System.out.print("La habitació " + noms[contador]
						+ " és a la planta " + dades[contador][1]
						+ " amb capacitat per " + dades[contador][0]
						+ " persones. ");
				if (ocupacio[contador]) {
					System.out.println("Ocupada");
				} else {
					System.out.println("Lliure");
				}
			}

		}

	}

	public void comprovarBuides(int[][] dades, String[] noms, boolean[] ocupacio) {

	}

	public static void main(String[] args) {
		boolean repetir = true;
		UtilitatsConsola utilitats = new UtilitatsConsola();
		Exercici09 exercici = new Exercici09();
		String[] noms = new String[20];
		int[][] dades = new int[20][2];
		boolean[] ocupacio = new boolean[20];
		exercici.omplir(dades, noms, ocupacio);
		do {
			switch (utilitats
					.llegirSencer("| 1 --> Mostra totes les habitacions. | 2 --> Mostra les habitacions d'una planta. | 3 --> Mostra les habitacions segons les places. | 0 --> Sortir.")) {
			case 1:
				exercici.mostrarTot(dades, noms, ocupacio);
				break;
			case 2:
				exercici.mostrarHabitacionsPlanta(dades, noms, ocupacio);
				break;
			case 3:
				exercici.mostrarHabitacionsPlaça(dades, noms, ocupacio);
				break;
			case 4:

				break;
			case 0:
				repetir = false;
				break;

			default:
				System.out.println("Error: Valor incorrecte");
				break;
			}
		} while (repetir);

	}

}