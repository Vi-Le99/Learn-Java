package PM;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayCollection {
	public static void main(String[] args) {
		ArrayList<Integer> love= new ArrayList<Integer>();
		love.add(15);//moi lan ham add chi co the add 1 so
		love.add(22);
		love.add(1);
		love.add(9);
		//Collection se sap xep mang tu be den lon
		//hoac tu a den z
		Collections.sort(love);
		for(int i:love) {
			System.out.println(i);
		}
		
		
		System.out.println("lấy phần tử 0 trong mảng: "+love.get(0));
		love.set(2,10);
		System.out.println("set phần tử 2 trong mảng, mảng hiện tại "+love);//(index, <giá trị>)
		love.remove(0);
		System.out.println("remove phần tử 0, mảng hiện tại:" +love);
		System.out.println("size mảng hiện tại:" +love.size());
		//love.clear(); cái này sẽ xóa hết phần tử mảng
	}
}
