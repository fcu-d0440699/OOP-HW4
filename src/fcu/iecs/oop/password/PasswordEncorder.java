package fcu.iecs.oop.password;

public class PasswordEncorder {
		private String Password;
		private char[] a={'a','A','e','E','i','I','o','O','t','T'};
		private char[] b={'4','4','3','3','1','1','0','0','7','7'};
		private int i;
		public String encode(String password){
			Password=password;
			for(i=0;i<10;i++){
				Password=Password.replace(a[i],b[i]);
			}		
			return Password;
		}
		
}
