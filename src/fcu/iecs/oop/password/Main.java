package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=" ",b="exit";
		PasswordEncorder pe = new PasswordEncorder();
		Scanner scanner = new Scanner(System.in);
		b="exit";
		
		do{
		System.out.println("Please enter a password: ");
		a =scanner.next();
		System.out.println(pe.encode(a));
		System.out.println("\n");
		}while(!(a.equalsIgnoreCase(b)));
		
		scanner.close();
	}

}
