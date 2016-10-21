package fcu.iecs.oop.tiida;
import java.util.Scanner;
//import fcu.iecs.oop.NissanTiida;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NissanTiida NT = new NissanTiida();
		Scanner scanner = new Scanner(System.in);
		
		int loop;
		System.out.println("Please enter a number: ");
		loop =scanner.nextInt();
		do{
			NT.tiida();
		}while(NT.count==loop);
		
		scanner.close();
	}

}
