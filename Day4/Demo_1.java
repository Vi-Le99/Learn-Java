package oop.modifier.fileio;
class A{
	//private A() {};
	int a=20;
	private int data1=10;
	protected String data2="hello, I'm a supperhero";
	public String data3="What's up! ";
	
	
	private void privateDemo() {
		System.out.println("ham private!");		
	}
	protected void protectedDemo() {
		System.out.println("ham protected!");	
	}
	public void publicDemo() {
		System.out.println("ham public!");	
	}
	void defaultDemo() {
		System.out.println("ham default");	
	}
}

public class Demo_1 {
	 public static void main(String args[]){  
		   A obj= new A(); //nếu constructor của class A là private thì k thể tạo được obj
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
