package Curs6;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] textArray = new String[5];
		//String[] textArray ={null, null, null, null, null};
		//index:                0      1    2     3      4
		
		System.out.println(textArray[1]);
		textArray[1]= "Maria";
		//String[] textArray ={null, "maria", null, null, null};
		System.out.println(textArray[1]);
		System.out.println(textArray[3]);
		textArray[3] = "Oana";
		System.out.println(textArray[3]);
		
		System.out.println("--------------------------------------------");
		
		System.out.println(textArray[5]);
		
		
	}

}
