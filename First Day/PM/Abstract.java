package PM;

abstract class Truong{
	int nam=20;
	public abstract void ten();
	
	//nho ham abstract void ten k can them dau {}
	//chi can neu ten ham thoi
}
class name extends Truong{
	public void ten() { //ke thua, ham nay k can them tu abstract nua
		System.out.println("Chuyen Long An");
	}
}
public class Abstract {
	public static void main(String[] args) {
		//Truong aTruong =new Truong();
		// khong the khoi tao object duoc vi class Truong la abstract (lop truu tuong)
		name a=new name();
		a.ten();
		
		
	}
}
