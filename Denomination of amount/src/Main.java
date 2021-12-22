//Denomination of amount
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] notes = {2000,500,200,100,50,20,5,2,1};
		int[] notcounter = {0,0,0,0,0,0,0,0,0,0};

		System.out.println("Enter the amount : ");
		int amount = scan.nextInt();

		for(int i=0;i<notes.length;i++){
			if(amount>=notes[i]){
				notcounter[i] = amount / notes[i];
				amount = amount - notcounter[i]*notes[i];
			}
		}
		
		for(int i =0 ;i<notes.length;i++){
			if(notcounter[i] != 0){
				System.out.println(notes[i]+" : "+notcounter[i]);
			}
		}
	}
}