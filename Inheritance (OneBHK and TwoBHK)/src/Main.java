import java.util.Scanner;

class OneBHK{
	private int roomArea, hallArea, price;
	
	OneBHK(int roomArea, int hallArea, int price){
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	OneBHK(){}
	
	void setroomArea(int roomArea) {
		this.roomArea = roomArea;
	}
	
	void sethallArea(int hallArea) {
		this.hallArea = hallArea;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getroomArea() {
		return roomArea;
	}
	
	int getHallArea() {
		return hallArea;
	}
	
	int getPrice() {
		return price;
	}
	
	void setData(int roomArea, int hallArea, int price) {
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	
	void show() {
		System.out.println("Room Area : "+roomArea);
		System.out.println("Hall Area : "+hallArea);
		System.out.println("Price : "+price);
	}
}

class TwoBHK extends OneBHK{
	private int room2Area;
	
	TwoBHK(int roomArea, int room2Area, int hallArea ,int price){
		setData(roomArea,hallArea,price);
		this.room2Area = room2Area;
	}
	
	void show() {
		System.out.println("Room Area : "+getroomArea());
		System.out.println("Hall Area : "+getHallArea());
		System.out.println("Price : "+getPrice());
		System.out.println("Room 2 Area : "+room2Area);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TwoBHK two[] = new TwoBHK[3];
		int i, total = 0;
		
		for(i=0;i<two.length;i++) {
			System.out.println("Enter the Room1 Area : ");
			int roomArea = in.nextInt();
			System.out.println("Enter the Room2 Area : ");
			int room2Area = in.nextInt();
			System.out.println("Enter the Hall Area : ");
			int hallArea = in.nextInt();
			System.out.println("Enter the Price : ");
			int price = in.nextInt();
			System.out.println("____________________________________________");
			two[i] = new TwoBHK(roomArea,room2Area,hallArea,price);
		}
	    
		for(i=0;i<two.length;i++) {
			total += two[i].getPrice();
			two[i].show();
		}
		System.out.println("____________________________________________");
		System.out.println("Total amount of all flats is "+total);
		System.out.println("____________________________________________");
		
		

	}

}
