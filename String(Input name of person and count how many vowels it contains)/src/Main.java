//Input name of a person  and count how many vowels it contains
class CountVowels{
	
	static void countVowels(String str) {
		int i;
		int count = 0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' ) {
				count++;
			}
		}
		System.out.println("Number of vowels are : "+count);
	}
}

public class Main {

	public static void main(String[] args) {
		String str = "Infobeans";
		CountVowels.countVowels(str);

	}

}
