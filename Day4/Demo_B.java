package oop.modifier.fileio_2;

import oop.modifier.fileio.Demo_3;
import oop.modifier.fileio.*;

public class Demo_B extends Demo_3{
	public static void main(String args[]){  
		   Demo_B obj= new Demo_B();
		   //Trong Demo_3, ta có int a tức là giá trị default, khác packed không thể truy cập
		  	 System.out.println(obj.a);
		 //error System.out.println(obj.data1);//vì private
		   
		 //Trong Demo_3, ta có protected String data2, vì class kế thừa nên dùng được 
		   System.out.println(obj.data2);
		   System.out.println(obj.data3);
		   
		 //error  privateDemo();
		  obj.protectedDemo();
		  obj.publicDemo();
		  // Bị lỗi vì đó là hàm default, chỉ truy cập được trong package
		  obj.defaultDemo();
		 }  
		
		
}
