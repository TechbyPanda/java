/*Create an object having two properties and four behaviours (add, substract,multiply,divide)
to perform desired operation.object must have setter and getter and keep all properties private.*/
import java.util.Scanner;

class Calculate{
	private int a;
	private int b;
	void setA(int a){
		this.a = a;
	}
	void setB(int b){
		this.b = b;
	}
	int getA(){
		return a;
	}
	int getB(){
		return b;
	}
	int add(){
		int c = a+b;
		return c;
	}
	int substract(){
		int c = a-b;
		return c;
	}
	int multiply(){
		int c = a * b;
		return c;
	}
	int divide(){
		int c = a/b;
		return c;
	}
}

class Main{
	public static void main(String args[]){
		Calculate c = new Calculate();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		c.setA(a);
		c.setB(b);
		System.out.println("additon : "+c.add());
		System.out.println("substraction : "+c.substract());
		System.out.println("multiplication : "+c.multiply());
		System.out.println("division : "+c.divide());
	}
}