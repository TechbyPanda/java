import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] a={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		int n;
		
		System.out.println("Enter the weekday : ");
		n = scan.nextInt();
		
		if(n>7 || n<1)
	    {
	    	System.out.println("invalid input");
	    }
	    else
	    System.out.println(" "+a[n-1]);
		
		
	}

}
