package oop.modifier.fileio;
abstract class DungCuVe {
	  public abstract void call1();
	}

	class Giay extends DungCuVe {
	  public void call1() {
	    System.out.println("Paper");
	  }
	}

	class Mau extends DungCuVe {
	  public void call1() {
	    System.out.println("Water Color");
	  }
	}
public class Abstract {
	public static void main(String[] args) {
	 //   DungCuVe aCuVe= new DungCuVe();//error: abstract khong the khoi tao doi tuong
		DungCuVe aCuVe= new Giay();
		DungCuVe bCuVe= new Mau();
		aCuVe.call1();
		bCuVe.call1();
	    
	}
}
