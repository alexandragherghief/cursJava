package Curs6;

import java.util.Scanner;

public class SwitchExample3 {

	/*
	 * facem program care imi cere de la tastatura un an si o luna si printeaza cate zile are luna respectiva
	 * ianuarie 31
	 * martie
	 */
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Te rog introdu un an:");
		int an = scan.nextInt();
		System.out.println("Te rog intridu o luna:");
		int luna = scan.nextInt();
		int days =0;
		//an%4==0 && an%100 !=0 || an%400==0
		//135781012 ==31 days
		//46911 == 30 days
		//2 ==28||29
		switch(luna) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days= 31;
			break;
		case 2:
			if(an%4==0 && an%100 !=0 || an%400==0) {
				days = 29;
			}else {
				days=28;
			}
		break;
		default:
			System.out.println("Valoare invalida");
		}
		
		
		System.out.println("Luna aleasa de tine are:" + days);

	}

}
