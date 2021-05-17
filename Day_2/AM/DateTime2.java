package PM;

import java.util.*;
import java.text.*;
public class DateTime2 {
	public static void main(String args[]) {
		  Date date = new Date();	      
	      System.out.println(date.toString());
	   
	
	
	//định dạng lại:
	Date dNow = new Date( );
																	//h: tính theo am,pm; a: show ra am hay pm
    SimpleDateFormat  a=new SimpleDateFormat ("'date: 'E dd/MM/yyyy ', time:' hh:mm:ss a");

    System.out.println(a.format(dNow));
	}
}
	
