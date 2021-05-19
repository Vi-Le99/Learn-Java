package oop.modifier.fileio;
public class Demo_3{
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
