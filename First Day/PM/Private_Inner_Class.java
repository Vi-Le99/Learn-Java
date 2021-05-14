package PM;

class Ngoai1{
	int x=1;
	
	private class Trong1 {
		int y=2;
	}
	
}
public class Private_Inner_Class {
	public static void main(String[] args) {
		Ngoai1 a =new Ngoai1();
		//Dong duoi error vi Trong la private class, k the truc tiep su dung
//		Ngoai1.Trong1 b =a.new Trong1();
		
	}
}
