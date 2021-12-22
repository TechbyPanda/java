import java.util.Scanner;

class DuplicateElementArray{
	
	void duplicateElement(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
		
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				
				}
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array element : ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		DuplicateElementArray d = new DuplicateElementArray();
		d.duplicateElement(arr);
	}
	
}
