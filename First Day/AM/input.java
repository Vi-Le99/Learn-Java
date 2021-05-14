package AM;
import java.util.Scanner;

public class input {
	public static void main(String[] args) {
	    try(Scanner a = new Scanner(System.in)){;
	    System.out.println("Enter username");

	    String userName = a.nextLine();
	    System.out.println("Username is: " + userName);
	  }
}
}