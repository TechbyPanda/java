/*Input data exactly in the string format and print sum of all integer values  */

class Sum{
	
	static void sum(String str) {
		int i;
		String str2[] = str.split(",");
		int sum=0;
		
		for(i=0;i<str2.length;i++) {
			sum += Integer.parseInt(str2[i]);
		}
		String result = ""+sum;
		System.out.println("Sum of given number is : "+result);
	}
}

public class Main {

	public static void main(String[] args) {
		String str = "2,2,2,2,2,2";
		Sum.sum(str);

	}

}
