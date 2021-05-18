package Am;
class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

class Dog extends Animal {
	   public void move() {
	      super.move();   // co cai nay, move() se in ra 2 gia tri cua move cha va move con
	      System.out.println("Dogs can walk and run");
	   }
	}

public class Override_1 {

	   public static void main(String args[]) {
	      Animal b = new Dog();   
	      b.move();   // se in ra 2 gia tri, neu k co move thi chi in 1 gia tri cua lop con
	   }
}
