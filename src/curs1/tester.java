package curs1;
// one line comment
/*
 * multi line comment
 */

//UperCamelCase   pt clasa
//lowerCamelCase //metodaMeaCareFaceLucruri (pt metoda)
public class Tester {
	//variabile
	private String nume;
	public int ratePerHour;
	
	//metoda getter
	public String getNume() {
		return nume;
	}
	//metoda setter
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	//constructor
	//public Tester() {}
	
	
	public Tester(String nume, int rate) {
		setNume(nume);
		ratePerHour = rate;
		
	}
	//Tester nume obj.= new Tester();
	/*
	 * Tester - numele clasei
	 * obj. - numele obiect
	 * = - operator de atribuire
	 * new - cuvant cheie in Java care ne ajuta sa instantiem o clasa
	 * Tester() -constructor
	 */
	//Tester nume obj= new Tester();
	// obj.setNume("Oana");
		
	
}
