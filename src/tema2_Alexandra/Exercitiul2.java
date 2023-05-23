package tema2_Alexandra;

import java.util.Scanner;

public class Exercitiul2 {

	int rezultat;
	public void intreabaRezultat() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu rezultatul testului :");
		rezultat= scan.nextInt();
	}
	
	public void comparaRezultat () {
		intreabaRezultat();
		if(0<rezultat && rezultat <=65) {
			System.out.println("Ai picat. Mai incerca!");
		}else {
			System.out.println("Felicitari, ai trecut!");
		}
		
		
	}
	
	
}
