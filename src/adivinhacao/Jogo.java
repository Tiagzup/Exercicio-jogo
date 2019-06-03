package adivinhacao;

import java.util.Random;

public class Jogo {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		for (int i = 0; i < 50; i--) {
			
			System.out.println(aleatorio.nextInt());
		}
		
		
	}

}
