package oop.modifier.fileio;

class People {
	public void call() {
	      System.out.println("People");
	   }
	}

class Student extends People {
	public void call() {
	      System.out.println("Student");
	}
	public void name() {
	      System.out.println("Ami99");
	   }
	}

public class Overriding {
	public static void main(String args[]) {
	      People a = new People();   
	      People b = new Student();   

	      a.call();   
	      b.call();   
	     // b.name();// bị lỗi, vì b có Type là people, nhưng people k có hàm name()
	   }
}
