package tema2_Alexandra;
import java.util.Scanner;
public class Exercitiul1 {
	
	int varsta;
	
	public void intreabaVarsta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu Varsta :");
		varsta= scan.nextInt();
		
	}
	public void comparaVarsta() {
		intreabaVarsta();
		if(0 < varsta && varsta <18) {
			System.out.println("Esti minor!");
		} else if (varsta >=18 && varsta <65) {
			System.out.println("Esti adult!");
		}else {
			System.out.println("Esti batran!");
		}
		
	}

}
