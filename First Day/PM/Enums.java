package PM;

//enum k the dung de tao object, K the thay doi gt ben trong, giong final
enum Color{
	yellow,orange, red,green, blue,purple,
}

public class Enums {
	public static void main (String[] args) {
		Color Ilike= Color.blue;
		System.out.println("I like "+ Ilike);
		for(Color rainbowl: Color.values()) {
			System.out.println(rainbowl);
		}
	}
	
}
