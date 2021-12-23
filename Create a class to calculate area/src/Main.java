/*Create a class to calculate Area of circle with one data member to store the radius and another to
store area
value. Create method members
init - input radius from user
calc - to calculate area
display - to display area*/
import java.util.Scanner;

class AreaOfCircle{
	private float r;
	Scanner scan = new Scanner(System.in);
	void setR(float r){
		this.r=r;
	}
	float getR(){
		return r;
	}
	void init(){
		System.out.println("Enter the radius : ");
		int r = scan.nextInt();
		setR(r);
	}
	float calc(){
		float a;
		r = getR();
		a = 3.14f * r * r;
		return a;
	}
	void display(){
		System.out.println(calc());
	}
}

class Main{
	public static void main(String args[]){
		AreaOfCircle aoc = new AreaOfCircle();
		aoc.init();
		aoc.calc();
		aoc.display();
}
}