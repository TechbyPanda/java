import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] day = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter week no. : ");
		byte n = in.nextByte();
		
		if(n>6)
			System.out.println("Invalid number.");
		else
			System.out.println(day[n-1]);	

	}

}
