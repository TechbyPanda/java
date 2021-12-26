import java.util.Arrays;
import java.util.Scanner;

//WAP check if a string are anagrams of each other

class Anagrams{
	
	static void anagrams(String str,String str2) {
		str = str.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str.length() == str2.length()) {
			
			char[] arr1 = str.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			boolean result = Arrays.equals(arr1, arr2);
			
			if(result) 
				System.out.println(str+" and "+str2+" are anagram.");
			else
				System.out.println(str+" and  "+str2+" are not anagram.");
			
			
		}
		
	}
}

public class Main {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		System.out.println("First String : ");
		String str = in.next();
		System.out.println("Second String : ");
		String str2 = in.next();*/
		String str = "Race";
		String str2 = "Care";
		Anagrams.anagrams(str , str2);

	}

}
