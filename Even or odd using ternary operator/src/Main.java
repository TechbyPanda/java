import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		
		String evenOdd = (n%2 == 0) ? "even" : "odd";
		
		System.out.println(n+" is "+evenOdd);	

	}

}
