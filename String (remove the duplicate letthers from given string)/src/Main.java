import java.util.Arrays;
import java.util.Scanner;

class RemoveDuplicate{
	 static String removeDuplicate(String s) {
		char[] c = s.toCharArray();
		int i,j;
		int index =0;
		
		for(i=0;i<c.length;i++) {
			for(j=0;j<i;j++) {
				if(c[i]==c[j])
					break;
			}
			if(i==j)
				c[index++] = c[i];
		}
		return (String.valueOf(Arrays.copyOf(c,index)));
	} 
}

public class Main {
	public static void main(String[] args) {
		String s ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		s = scan.nextLine();
		
		System.out.println(RemoveDuplicate.removeDuplicate(s));
		
	}

}
