package oop.modifier.fileio;
import java.io.FileWriter;  
import java.io.IOException; 
import java.util.Scanner;


//viết dữ liệu nhập vào vào trong file writeData.txt
public class WriteFileDemo {
	public static void main(String[] args) {
		Scanner aScanner=new Scanner(System.in);
		System.out.println("Input: ");
		String content=aScanner.nextLine();
		
	    try {
	      FileWriter fw = new FileWriter("writeData.txt",true); //xác định file cần viết vào
	      fw.write(content);//viết nội dung vào
	      fw.close();//đóng lại
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("Error: "+e);
	      
	    }
	  }
}
