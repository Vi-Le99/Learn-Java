package Am;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
//lay noi dung nhap vao ghi vao file
public class ReadWriteFile {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Input: ");
		String txt=a.nextLine();
		try {
			FileWriter fw=new FileWriter("data.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(txt);
			
			bw.close();
			fw.close();
		}catch(Exception e) {
			
		}
		
	}
}
