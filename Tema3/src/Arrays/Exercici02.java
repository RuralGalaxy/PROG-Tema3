package Arrays;

/**
 * Exercici 2
 * 
 * Escriviu una classe que crei un vector de 10 sencers, els inicialitzi de 1 a
 * 10 aleatòriament i els mostri per pantalla. Per a generar els números
 * aleatòriament podeu utilitzar Math.random(). Torna un float entre 0 i 1 (no
 * inclòs). Per obtenir un nombre dins el rang demanat [min, max] inclosos,
 * haureu de fer
 * 
 * Min+(int)(Math.random()*((Max-Min)+1))
 * en el noste cas per [1, 10]
 * 1+(int)(Math.random()*((10- 1)+1))
 * 
 * @author: Rafel Sastre Mas.
 */

public class Exercici02 {

	public void array10sencersaleatoris() {

		int[] array = new int[10];
		
		for (int comptador = 0; comptador<10; comptador++ )
		{
			array[comptador]= 1+(int)(Math.random()*((10- 1)+1));
			System.out.println(array[comptador]);
		}
		
		

	}

	public static void main(String[] args) {

		Exercici02 ex02 = new Exercici02();
		ex02.array10sencersaleatoris();

	}

}
