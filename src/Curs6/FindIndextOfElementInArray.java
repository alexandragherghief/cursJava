package Curs6;

public class FindIndextOfElementInArray {

	/*
	 * avem un array si vrem sa aflam indexul unui anumit element
	 * ex: index pentru element 8 este 3
	 * rezilvam cu:
	 * for
	 * for each
	 * while
	 * do while
	 */
	
	static int[] numbers = {3,5,7,8,9,2,12};
	public static void main(String[] args) {
		
		System.out.println("-----FOR");
		rezolvareCuFor(8);
		System.out.println("-----FOR EACH");
		rezolvareCuForEach(8);
		System.out.println("-----While");
		rezolvareCuDoWhile(8);
		System.out.println("-----DO WHile");
		rezolvareCuDoWhile(8);
		
		
	}
   
	public static void rezolvareCuFor(int element) {
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]== element) {
				System.out.println("Index pentru " + element + " este " + i);
			}
		}
	}
	
	public static void rezolvareCuForEach(int number) {
		int i=0;
		for (int element : numbers) {
			if(number == element) {
				System.out.println("Index pentru " + element + " este " + i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuDoWhile (int number) {
		int i = 0;
		do {
			if(numbers[i]== number) {
				System.out.println("Index pentru " + number + " este " + i);
			}
			i++;
		}while(i < numbers.length);
	}
	
	
}
