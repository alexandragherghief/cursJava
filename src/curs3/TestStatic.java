package curs3;

public class TestStatic {

	public static void main(String[] args) {
	
	StaticVsNonStatic obj =	new StaticVsNonStatic();
	obj.prenume = "Ceva";
	//obj.nume = "Altceva";
	obj.printNormal();
	//obj.PrintStatic();
		
	StaticVsNonStatic.nume = ";Altceva";
	StaticVsNonStatic.PrintStatic();
	
	
	
	/* 1. compileaza
	 * .....
	 * 3. incarca in memprie membrii statici
	 * 
	 * ....
	 * 5. Instantiaza obiecte
	 * 
	 */
	
	}

}
