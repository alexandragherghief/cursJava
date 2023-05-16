package curs3;

public class StaticVsNonStatic {
// variabila statica (variabila de clasa) pt ca nu este asociata cu instanta clasei cu care este asociata
	public static String nume;
	
	
	
	
	// variabila de instanta - poate fi folosita doar avand o instanta (obj) al clasei respective
	public String prenume;
	//metoda statica
	public static void PrintStatic() {
	System.out.println("Static");}
	
	//metoda de instanta
	public void printNormal() {
		System.out.println("Print normal");
	}
}
