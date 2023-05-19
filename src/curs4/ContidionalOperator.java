package curs4;
import java.util.Scanner;
public class ContidionalOperator {

	/*
	 * program care cuteste 2 nr de la tastatura
	 * daca fecare nr este pozitiv
	 * daca ambele nr sunt pozitive
	 * care dintre cele 2 nr este cel mai mic sau daca sunt egale
	 */
	
	
	
	public static void main(String[] args) {
		
			int num1;
			int num2;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter first numer");
			num1 = scan.nextInt();
			System.out.println("Please enter second number");
			num2 = scan.nextInt();
		
			if(num1 >= 0) {
				System.out.println("Num1 is pozitive");
			}else {
				System.out.println("Num1 is negative");
			}

			//result = conditie?expesie1:expresie2
			
			
			
			if(num2 >= 0) {
				System.out.println("Num2 is pozitive");
			}else {
				System.out.println("Num2 is negative");
			}
			String result = num1>=0?"Numbers are pozitive":"numbers are negative ";
			System.out.println("TR=" +result);
			
			
			if(num1 >= 0 && num2 >= 0) {
				System.out.println("Numbers are pozitive");
			}else {
				System.out.println("Numbers are negative");
			}
			result = num1>=0 && num2>= 0?"Num2 is pozitive":"num2 is negative";
			System.out.println("TR=" +result);
			
			if(num1>num2) {
				System.out.println("Num1 is the greatest");

			}else if(num1 <num2) {
				System.out.println("Num2 is the greatest");

			}else {
				System.out.println("Numbers are equal");
				
			}
			result = num1>num2?"num2 is the greatest":num1<num2?"Num2 is the greatest":"Numbers are equal";
			System.out.println("TR=" +result);
	}

}
