import java.util.Scanner;

class LeftRotate{
	
	void leftRotate(int arr[],int size){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of time you want rotates : ");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			int j, first;
			first = arr[0];
			
			for(j=0;j<arr.length-1;j++) {
				
				arr[j] = arr[j+1];
			}
			
			arr[j] = first;
		}
		
		System.out.println("Array after left rotation.....");
		for(int i=0;i<size;i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			
			System.out.println("arr["+i+"] = ");
			arr[i] = scan.nextInt();
			
		}
		
		LeftRotate lf = new LeftRotate();
		lf.leftRotate(arr,size);

	}

}
