package Exercicis;

/**
 * Exercici 1
 * Crea una classe amb un mètode anomenat simpatic que rebi com a paràmetre una
 * cadena de caràcters amb un nom i saludi aquesta persona.
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici01 {

	public void simpatic(String nom) {

		System.out.println("Hola " + nom + "!!");

	}

	public static void main(String[] args) {

		Exercici01 ex01 = new Exercici01();
		ex01.simpatic("Rafel");

	}

}
