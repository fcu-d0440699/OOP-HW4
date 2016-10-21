package fcu.iecs.oop.password;

public class PasswordEncorder {
		private String Password;
		
		public String encode(String password){
			Password=password;
			Password=Password.replace('a','4');
			Password=Password.replace('A','4');
			Password=Password.replace('e','3');
			Password=Password.replace('E','3');
			Password=Password.replace('i','1');
			Password=Password.replace('I','1');
			Password=Password.replace('o','0');
			Password=Password.replace('O','0');
			Password=Password.replace('t','7');
			Password=Password.replace('T','7');
			
			return Password;
		}
		
}
