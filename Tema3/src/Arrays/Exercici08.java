package Arrays;

/**
 * Exercici 8
 * 
 * Simulau el sorteig de la primitiva. Heu de tenir
 * 
 * un mètode que generi un "boleto", és a dir que guardi dins un array 6 números
 * diferents de l'1 al 49
 * 
 * alguna forma de generar la combinació guanyadora, aleatòriament.
 * 
 * un mètode que comprovi un "boleto", és a dir si té 6 encerts, 5, 4, o 3, i
 * torni quin premi té.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici08 {

	public int[] generarBoleto(int[] numero) {
		int min = 1;
		int max = 49;

		for (int comptador = 0; comptador < numero.length; comptador++) {
			int result = min + (int) (Math.random() * (max - min) + 1);
			numero[comptador] = result;
			System.out.print(" " + numero[comptador]);
		}
		return numero;
	}
	
	public void compararBoleto(int[] numero){
		for (int posicio = 0; posicio < numero.length; posicio++) {
			for(int posicio2 = 0; posicio2 < numero.length; posicio2++){
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		int[] boleto = new int[6];
		int[] boletoPropi = new int[6];
		Exercici08 ex08 = new Exercici08();
		ex08.generarBoleto(boleto);
		ex08.generarBoleto(boletoPropi);
		
	}
}