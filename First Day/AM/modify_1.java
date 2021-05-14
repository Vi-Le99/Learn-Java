package AM;
//truu tuong
abstract class modify_1 {
	public String name= "Ami";
	int old=10;
	public abstract void study() ;	// abstract method
}
// subclass (lop con ke thua) dung extends

class Student extends modify_1{
	public int lop=5;
	int stt=26;
	// the body of the abstract method is provided here
	public void study() {
		System.out.println("Studying all day long");		
	}
	
}
