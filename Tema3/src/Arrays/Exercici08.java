package Arrays;

/**
 * Exercici 8
 * 
 * Simulau el sorteig de la primitiva. Heu de tenir
 * 
 * un m�tode que generi un "boleto", �s a dir que guardi dins un array 6 n�meros
 * diferents de l'1 al 49
 * 
 * alguna forma de generar la combinaci� guanyadora, aleat�riament.
 * 
 * un m�tode que comprovi un "boleto", �s a dir si t� 6 encerts, 5, 4, o 3, i
 * torni quin premi t�.
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