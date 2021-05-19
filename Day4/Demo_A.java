package oop.modifier.fileio_2;

import oop.modifier.fileio.*;

public class Demo_A {
	/*public static void main(String args[]){  
		   A obj= new A();// bị lỗi vì class A là class default, chỉ có thể truy cập bên trong package
		   //và bên trong packed thôi
		   System.out.println(obj.a);
		 //error System.out.println(obj.data1);
		   System.out.println(obj.data2);
		   System.out.println(obj.data3);
		   
		 //error  privateDemo();
		  obj.protectedDemo();
		  obj.publicDemo();
		  obj.defaultDemo();
		 }  */
	public static void main(String args[]){  
		   Demo_3 obj= new Demo_3();
		   //Trong Demo_3, ta có int a tức là giá trị default, khác package không thể truy cập
		  	 System.out.println(obj.a);
		 //error System.out.println(obj.data1);//vì private
		   
		 //Trong Demo_3, ta có protected String data2, khác package chỉ truy cập được khi nó class kế thừa 
		   System.out.println(obj.data2);
		   System.out.println(obj.data3);
		   
		 //error  privateDemo();
		  obj.protectedDemo();
		  obj.publicDemo();
		  obj.defaultDemo();
		 }  
		
		
}
