package Am;

public class Method {
	 public static void main(String[] args) {
	      int a = 30;
	      int b = 45;
	      System.out.println("Trước khi hoán vị, a = " + a + " and b = " + b);

	      // Invoke the swap method
	      swapFunction(a, b);	    
	      System.out.println("Sau khi thực hiện hàm hoán vị, a = " + a + " and b is " + b);
	      System.out.println("Giá trị đối số vẫn giữ nguyên");
	   }

	   public static void swapFunction(int a, int b) {
	      System.out.println("Trước khi hoán vị(Inside swapFunction), a = " + a + " b = " + b);
	      
	      // Swap n1 with n2
	      int c = a;
	      a = b;
	      b = c;
	      System.out.println("Sau khi hoán vị(Inside swapFunction), a = " + a + " b = " + b);
	   }
}
