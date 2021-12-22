import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a;
		
		System.out.println("Enter the value : ");
		a = scan.nextLine();
		checkCases(a);

	}
	
	static void checkCases(String a) {
		
		int upper = 0, lower =0 , integer =0 , special =0;
		
		for(int i = 0; i < a.length() ; i++) {
			char ch = a.charAt(i);
			if (ch >= 'A' && ch <= 'Z' )
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				integer++;
			else 
				special++;
		}
		System.out.println("Lower case : "+lower);
		System.out.println("Upper case : "+upper);
		System.out.println("Integer case : "+integer);
		System.out.println("Special character : "+special);
		
	}

}
