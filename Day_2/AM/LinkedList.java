package PM;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LinkedList {
	 public static void main(String[] args) {
		    LinkedList<String> cars = new LinkedList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    
		    // Use addFirst() to add the item to the beginning
		    cars.addFirst("Mazda");
		    System.out.println(cars);
		  }
}
