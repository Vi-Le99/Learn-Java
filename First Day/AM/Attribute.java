package AM;

public class Attribute {
	int x=10;
	final int y=5;
	public static void main(String[] args) {
		Attribute vi = new Attribute() ;
		System.out.println(vi.x+10);
		
		System.out.println(vi.y);
		//y gt co dinh, khong the cong them
	}
}
