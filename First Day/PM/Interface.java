package PM;
//interface is a completely "abstract class"
// ham ben trong k can dien abstract
//ke thua k dung extends ma dung implements
//Like "abstract classes", "interfaces" cannot be used to create objects
//Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)
//1 class chi co the ke thua tu 1 class cha
//nhung neu dung interface, 1 class co the ke thua tu nhieu class cha

// syntax: interface <name>
interface HS{
	public void lop();
}
interface GV{
	public void DayMon();
}

class CaoDang implements HS,GV{
	public void lop() {
		System.out.println("Co 5 lop ");
	}
	public void DayMon() {
		System.out.println("Day 12 mon can ban");
	}
}


public class Interface {
	public static void main(String[] args) {
		CaoDang a=new CaoDang();
		a.lop();
		a.DayMon();
	}
}
