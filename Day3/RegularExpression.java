package Am;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		/*
		//chi duoc nhap 1 so
		Scanner a =new Scanner(System.in);
		System.out.println("input: ");
		String txtString=a.nextLine();
		System.out.println(txtString);
		
		Pattern p=Pattern.compile("^[0-9]$");
		if(p.matcher(txtString).find()) {
			System.out.println("input ok");
		}else {
			System.err.println("wrong");
		}
		
		*/
		
		////////////////////////////
		//cho vao vong lap, neu nhap thi nhap lai\
		Pattern p=Pattern.compile("^[0-9]$");
		//để nhập nhiều số (thêm dấu + là nhập thoải mái bao nhiêu cũng đc): Pattern p=Pattern.compile("^[0-9]+$");
		//nhập số >=6 kí tự: "^[0-9]{6,}$"
		//nhập số =6 kí tụ: "^[0-9]{6}$"
		//nhập số từ 6-10 kí tự: "^[0-9]{6,10}$"
		//nhập chuỗi chữ: "^[a-zA-Z]$"
		//nhập chuỗi gồm nhiều chữ, số, dấu cách: "^[a-zA-Z0-9 ]+$"
		while (true) {
			Scanner a=new Scanner(System.in);
			System.out.println("input: ");
			String txtString=a.nextLine();
			if(p.matcher(txtString).find()) {
				System.out.println("input ok");
				break;
			}else {
				System.err.println("wrong");
			}
		}
		
		
		
	}
}
