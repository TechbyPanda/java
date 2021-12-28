import java.util.Scanner;

abstract class Processor{
	int n;
	
	abstract void processor();
}

class Factorial extends Processor{
	Scanner in = new Scanner(System.in);
	
	void processor() {
		int r=1;
		System.out.println("Enter the value : ");
		n = in.nextInt();
		while(n!=0) {
			r *=n;
			n--;
		}
		System.out.println("Factorial : "+r);
		
	}
	
}

class Circle extends Processor{
	Scanner in = new Scanner(System.in);
	void processor() {
		System.out.println("Enter the value : ");
		n = in.nextInt();
		System.out.println("Area of circle : "+(3.14*n*n));
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		char ch = in.next().charAt(0);
		
		if(ch == 'f') {
			new Factorial().processor();
		}
		else if(ch == 'a') {
			new Circle().processor();
		}

	}

}
