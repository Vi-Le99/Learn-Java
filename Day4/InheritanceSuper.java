package oop.modifier.fileio;
//dùng super.method()
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SuperClass {
	   int num = 20;
	   public void show() {
	      System.out.println("- Lớp cha");
	   }
	}

class SubClass extends SuperClass{
	int num=30;
	public void show() {
		System.out.println("- Lớp con");
		super.show();//dùng super, có thể gọi hàm show của lớp cha
		System.out.println("gt biến của cha: "+super.num);
		System.out.println("gt biến của con: "+num);
	}
}

public class InheritanceSuper {
	public static void main(String[] args) {
			SubClass obj=new SubClass();
			obj.show();
	}
}
