package PM;

public class Array2 {
	public static void main(String[] args) {
	      double[] myList = {1.5, 1.9, 3.2, 5.4, 7.6};

	      //in phần tử mảng
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	      
	     //tính tổng phần tử	     
	      double total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      
	      // tìm phẩn tử lớn nhất
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) 
	        	 max = myList[i];
	      }
	      System.out.println("Số lớn nhất là " + max);  
	      
	      
	      ////////////////
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      System.out.println(charArray);
	   }
	
	
}
