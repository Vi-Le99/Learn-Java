package oop.modifier.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {
	public static void main(String[] args) {
		
		String content="";
		
	    try {
	    	File obj=new File("data.txt");//xác định file cần đọc
	    	Scanner aScanner=new Scanner(obj); //scanner dùng để đọc file
	    	while(aScanner.hasNextLine()) { 
	    		content=aScanner.nextLine();
	    		System.out.println(content);
	    	}	    	
	    	aScanner.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("File's not exist: "+e);
	      
	    }
	  }
}
