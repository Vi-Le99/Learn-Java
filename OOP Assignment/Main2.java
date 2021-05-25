package OOP;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		Student student1 = new Student();// khoi tao gia tri co ban cua student
		student1.setId(17001);
		student1.setName("Nguyen Van A");
		student1.setOld(16);
				

		Teacher teacher1 = new Teacher();//khoi tao gia tri co ban cua teacher
		teacher1.setId(1);
		teacher1.setName("Lam Ngoc");		
		teacher1.setOld(30);

		student1.setTeacher(teacher1);//set thuoc tinh teacher cua student
		
		List<Student> studentList1=new ArrayList<Student>();//khoi tao list hs cua 1 gv
		studentList1.add(student1);		
		
		teacher1.setStudentList(studentList1);//truyen list vao ham set list cua teacher
		
		///////////
		Student student2 = new Student();
		student2.setId(17002);
		student2.setName("Nguyen Van K");
		student2.setOld(16);
		student2.setTeacher(teacher1);
		studentList1.add(student2);	
		
		
		
		System.out.println(student1.toStringTeacher());
		System.out.println(teacher1.toString());

	}

}
