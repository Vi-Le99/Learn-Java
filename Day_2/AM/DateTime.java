package PM;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[]args) {
		LocalDate a =LocalDate.now();
		LocalTime b = LocalTime.now();
		LocalDateTime c= LocalDateTime.now();
		System.out.println("date: "+ a);
		System.out.println("time: "+ b);
		System.out.println("datetime: "+ c);
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-M-yy H:m:s");
		//MM: thang theo so(co 2 so), M:thang co 1 so, H: thoi gian tinh 11h
		//HH: thoi gian duoc tinh la 24h 
		String dd= c.format(d);
		System.out.println("datetimeFormatter: "+ dd);
		
	}
}
