
public class Main {
	
	static void check(String str) {
		int flag =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '0' ||str.charAt(i) == '1' ||str.charAt(i) == '2' ||str.charAt(i) == '3' ||str.charAt(i) == '4' ||str.charAt(i) == '5' ||str.charAt(i) == '6' ||str.charAt(i) == '7' ||str.charAt(i) == '8' ||str.charAt(i)=='9') 
				flag=1;
			else {
				flag = 0;
				break;
			}
				
		}
		if(flag == 1)
			System.out.println("Only contians digits");
		else
			System.out.println("Also contains alphabet");
	}
	
	public static void main(String[] args) {
		String str = "982622715";
		check(str);

	}

}
