package PM;
class A{
	int x=1;
	
	static class B {
		int y=2;
	}
	
}
public class Static_Inner_Class {
	public static void main(String[] args) {
		
		//de lay gt y trong static class, lam nhu duoi
		//k can dong A value=new A()  
	    A.B value = new A.B();//chi lay dc gt trong class B
	    System.out.println(value.y);
	    
	  }
}
