package Exercicis;

/**
 * Exercici 2
 * Copiau l'exercici anterior i modificau-lo de la seg�ent manera: afegiu un
 * m�tode que llegeixi el nom de la persona del teclat i passau aquest nom al
 * m�tode simpatic.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici02 {

	public void simpatic(String nom) {

		System.out.println("Hola " + nom + "!!");

	}

	public static void main(String[] args) {

		LlegirCadena teclat = new LlegirCadena();
		Exercici02 ex02 = new Exercici02();
		ex02.simpatic(teclat.llegirCadena("Escriu el teu nom!"));

	}

}
