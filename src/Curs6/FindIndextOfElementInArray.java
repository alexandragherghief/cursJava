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
		
		
		
		
	}
   
	public static void rezolvareCuFor(int element) {
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]== element) {
				System.out.println("Index pentru" + element +"este" + i);
			}
		}
	}
	
	public static void rezolvareCuForEach(int number) {
		int i=0;
		for (int elentent :numbers) {
			if(number == element) {
				System.out.println("Index pentru" + element +"este" + i);
			}
			i++;
		}
	}
	
	
	
}
