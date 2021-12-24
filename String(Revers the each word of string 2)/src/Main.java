class ReverseWord{
	
	static String reverseWord(String str) {
		String c[] = str.split(" ");
		int i;
		String word;
		String  str2 = "" ;
		
		for(i=0;i<c.length;i++) {
			word = c[i];
			
			for(int j=word.length()-1;j>=0;j--) {
				
				str2 += word.charAt(j);
			}
			str2 +=" ";
			
		}

			return str2;
	}
}
public class Main {

	public static void main(String[] args) {
		String str = "I am learning java";
		System.out.println(ReverseWord.reverseWord(str));

	}

}
