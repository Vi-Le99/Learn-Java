package AM;

public class static_public {

	static void Dog() {
		System.out.println("gau gau gau");
	}
	
	public void Cat() {
		System.out.println("meow meow meow");
	}
	
	public static void main(String[] args) {
		Dog(); //method static co the dung truc tiep
		static_public animal= new static_public();
		// method public phai co object moi dung dc
		animal.Cat();
		
	}
}
