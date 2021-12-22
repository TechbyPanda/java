// Count no. of digits of an integer
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int count=0;

		System.out.println("Enter the integer : ");
		int n = scan.nextInt();

		while(n!=0){
			n/=10;
			++count;
		}
		System.out.println("Number of digit in integer is "+count);
	}
}