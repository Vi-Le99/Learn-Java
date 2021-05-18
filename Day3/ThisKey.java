package Am;

public class ThisKey {
	int num = 10;
	
	   ThisKey() {
	      System.out.println("This is an example");	
	   }

	   ThisKey(int num) {
		  //this();
	      this.num = num;	   
	   }
	   
	   public void greet() {
	      System.out.println("what's up");
	   }
	      
	   public void print() {
	      // Local variable num
	      int num = 20;
	      
	      System.out.println("value of local variable num is : "+num);
	      System.out.println("value of instance variable num is : "+this.num);
	      
	     
	      this.greet();     
	   }
	   
	   public static void main(String[] args) {
	      
	      ThisKey obj1 = new ThisKey();
	      obj1.print();
		  
	      ThisKey obj2 = new ThisKey(30);
	      obj2.print(); 
	   }
}
