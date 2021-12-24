//WAP to find word of maximum length  in given string
class MaxLength{
	
	static void maxLength(String str) {
		String measure[] = str.split(" ");
		String result = "";
		
		for(int i=0;i<measure.length;i++) {
			
			if(result.length()<=measure[i].length()) {
				result = measure[i];
			}
		
		}
		System.out.println("Largest word : "+result);
	}
	
}

public class Main {

	public static void main(String[] args) {
		String str = "techPanda love coding";
		MaxLength.maxLength(str);

	}

}
