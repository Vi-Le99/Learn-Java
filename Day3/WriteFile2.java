package Am;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;



//viet 1 mang vao file
public class WriteFile2 {
	public static void main(String[] args) {
		String[] aStrings= {"Nguyen Van A","toan"};
		String[] bStrings= {"Nguyen Van B","van"};
		try {
			//FileWriter fw=new FileWriter("data.txt", true);//tuc la ghi them du lieu vao
			FileWriter fw=new FileWriter("data.txt");//tao moi file, xoa du lieu cu, ghi dulieu moi
			BufferedWriter bw=new BufferedWriter(fw);
			for(String iString:aStrings) {
				bw.write(iString);
				bw.newLine();
			}
			for(String iString:bStrings) {
				bw.write(iString);
				bw.newLine();
			}
			bw.close();
			fw.close();
		}catch(Exception e) {
			
		}
		
		
		System.out.println("------read file");
		try {
			FileReader fr=new FileReader("data.txt");//tuc la ghi them du lieu vao
			BufferedReader br=new BufferedReader(fr);
			String lineString="";
			while(true) {
				lineString=br.readLine();
				if(lineString==null) {
					break;
				}
				System.out.println(lineString);
			}
			br.close();
			fr.close();
		
		}catch(Exception e) {
			
		}
			
	
	}
}
