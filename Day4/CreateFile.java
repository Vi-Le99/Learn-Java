package oop.modifier.fileio;
import java.io.File;
import java.io.IOException;  


public class CreateFile {
	public static void main(String[] args) throws IOException {
	    
	      File obj = new File("data.txt");//xác định file cần tạo
	      
	      if (obj.createNewFile()) { //dùng hàm createNewFile để tạo File, nếu hàm true thì tạo mới
	        System.out.println("Tạo file thành công : " + obj.getName());
	      } else {
	        System.out.println("File đã tồn tại.");
	      }
	    
	  }
}
