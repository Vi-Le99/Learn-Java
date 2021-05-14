package PM;

class Ngoai {
	  int x = 10;

	  class Trong {
	    int y = 15;
	  }
	}
public class InnerClasses {
	public static void main(String[] args) {
	    Ngoai a = new Ngoai();
	    // khong phai static nen ta can tao 1 object
	    //de dung duoc bien y ben trong:
	    Ngoai.Trong b = a.new Trong();
	    //b khoi tao voi class trong, nen k the dung gt x dc
	    System.out.println(b.y + a.x);
	  }
}
