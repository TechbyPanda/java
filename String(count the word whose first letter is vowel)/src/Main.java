/*WAP to count the word whose first letter is vowel*/
class VowelWord{
	
	static void vowelWord(String str) {
		String str2[] = str.split(" ");
		int count =0;
		
		for(int i=0;i<str2.length;i++) {
			if(str2[i].charAt(0) == 'a' || str2[i].charAt(0) == 'e' || str2[i].charAt(0) == 'i' || str2[i].charAt(0) == 'o' || str2[i].charAt(0) == 'u' || str2[i].charAt(0) == 'A' || str2[i].charAt(0) == 'E' || str2[i].charAt(0) == 'I' || str2[i].charAt(0) == 'O' || str2[i].charAt(0) == 'U') {
				count++;
			}
		}
		System.out.println("Number of words which start with vowels : "+count);
	}
	
}

public class Main {

	public static void main(String[] args) {
		String str = "life is hard for 2 resons : - either because you're leaving your comfort zone or because staying in it .";
		VowelWord.vowelWord(str);

	}

}
