package AM;
//ke thua
import java.util.Scanner;
	class Inheritance {
		protected String name="ami";
		public void slogan() {
			try(Scanner textScanner= new Scanner(System.in)){;
			System.out.println("Please write your slogan: ");
			String text= textScanner.nextLine();
			System.out.println("So your slogan: "+text);
		}		
		}
}
// dong duoi go public class se bi loi
	class hello extends Inheritance{
		public String aString="hello everyone! ";
// may dong nay khong hoat dong, phai tach ra file khac
//		public static void main(String[] args) {
//		hello bHello=new hello();
//		System.out.println(bHello.aString+" My name is "+bHello.name);
//		bHello.slogan();
//		}
	}
	