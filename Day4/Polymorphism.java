package oop.modifier.fileio;

class Nguoi {
	  public void call() {
	    System.out.println("people");
	  }
	}

	class HocSinh extends Nguoi {
	  public void call() {
	    System.out.println("Student");
	  }
	}

	class GiaoVien extends Nguoi {
	  public void call() {
		//  super.call();
	    System.out.println("Teacher");
	  }
	}
public class Polymorphism {

	public static void main(String[] args) {
	    Nguoi a=new Nguoi();
	    Nguoi b=new HocSinh();
	    Nguoi c=new GiaoVien();
	    
	    a.call();
	    b.call();
	    c.call();
	  }
}
