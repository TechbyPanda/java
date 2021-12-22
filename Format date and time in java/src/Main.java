import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		String strDate = formatter.format(date);
		
		System.out.println("Date format with MM/dd/yyyy : "+strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		
		strDate = formatter.format(date);
		
		System.out.println("Date format with dd-M-yyyy hh:mm:ss"+strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		
		strDate = formatter.format(date);
		
		System.out.println("Date format with dd MMMM yyyy zzzz : "+strDate);
		
		formatter = new SimpleDateFormat("E,dd MMMM yyyy HH:mm:ss z");
		
		System.out.println("Date format with E, dd MMMM yyyy HH:mm:ss z : "+strDate);
		

	}

}
