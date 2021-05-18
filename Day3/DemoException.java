package Am;
import java.io.File;
import java.io.FileReader;


public class DemoException {
	
	
	public static void main(String args[]) {
	    try {
	    	int num[] = {1, 2, 3, 4};
		    System.out.println(num[5]);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}  
	    //--------------------
	    
		try {
			  File file = new File("F://file.txt");
		      FileReader fr = new FileReader(file); 
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}finally {
			System.out.println("----------");
		}
	    
		//------------------
		
		checkAge(13);   
	    
	
	}
	static void checkAge(int age) {
	    if (age < 18) {
	      throw new ArithmeticException("Không thể kết nối, bạn phải từ 18 tuổi trở lên.");
	    }
	    else {
	      System.out.println("Kết nối thành công!");
	    }
	  }

}
