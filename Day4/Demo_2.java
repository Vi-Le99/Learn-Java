package oop.modifier.fileio;

class Demo_2 {
	 public static void main(String args[]){  
		   A obj= new A();
		   System.out.println(obj.a);
		 //error System.out.println(obj.data1);
		   System.out.println(obj.data2);
		   System.out.println(obj.data3);
		   
		 //error  privateDemo();
		  obj.protectedDemo();
		  obj.publicDemo();
		  obj.defaultDemo();
		 }  
}
