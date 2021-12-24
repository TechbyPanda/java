
class Count{
	
	static void count(String str) {
		int i;
		int[] fr = new int[100];
		int visited = -1;
		
		for(i=0;i<str.length();i++) {
			int count = 1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
			
			System.out.println("-----------------------------------------");
			System.out.println("     ELEMENT      |       FREQUENCY      ");
			System.out.println("-----------------------------------------");
			for(i=0;i<str.length();i++) {
				
				if(fr[i]!=visited) {
					System.out.println("      "+str.charAt(i)+"           |        "+fr[i]);
				}
			}
			
		}
		
	}
	

public class Main {

	public static void main(String[] args) {
		String str = "BBBBBBBBBBBBBBBBAAAAAAAAAAAAAACCCCCCCCCCCCCCCcc";
		Count.count(str);

	}

}
