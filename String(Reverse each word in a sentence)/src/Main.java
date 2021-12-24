import java.util.Scanner;

class ReverseWord{
	
	public static String reverse(String s){
		String str[] = s.split("\\s");
		String rev = "" ;//we didn't do that it will generate error rev not have been iniitaliazed
		
		for(String sw : str) {
			StringBuilder sb = new StringBuilder(sw);
			sb.reverse();
			rev += sb.toString() + " ";
		}
		return rev;
		
	}
	
}
/*output:
 * This is tech panda
Original String
This is tech panda
---------------------------
Reverse String
sihT si hcet adnap 
 */

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = in.nextLine();
		System.out.println("Original String");
		System.out.println(s);
		System.out.println("---------------------------");
		System.out.println("Reverse String");
		System.out.println(ReverseWord.reverse(s));//Static method are reffrence by the class name itself of reference to the object of that class

	}

}
