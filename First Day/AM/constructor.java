package AM;

public class constructor {
	int lop;
	String hoten;
	// ham khoi tao
	//public <ten cua public class>
	public constructor(int a, String b) {
		lop=a;
		hoten=b;
	}
	
	public static void main(String[] args) {
		constructor hs = new constructor(3, "vi");
		System.out.println("trong lop " +hs.lop+" co hs ten la "+hs.hoten);
		
	}
}
