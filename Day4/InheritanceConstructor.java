package oop.modifier.fileio;

class CSuperClass {
	  int num;
	 public CSuperClass(int num) {
		this.num=num;
	}
}
class CSubClass extends CSuperClass{
	
	// Nếu k có hàm này thì lớp con khi khởi tạo như bên dưới sẽ bị lỗi, vì lớp con sẽ
	//lấy hàm khởi tạo mặc định của lớp cha, chứ k lấy hàm khởi tạo có tham số
	
	 CSubClass(int a) {
	      super(a);// dùng để gọi hàm khởi tạo có tham số của lớp cha
	   }
	 
//	 -----------
	 public void show() {
	      System.out.println("- Lớp con");
	   }
	 
}
public class InheritanceConstructor {
	public static void main(String[] args) {
		CSubClass obj=new CSubClass(10);
		obj.show();
	}
}
