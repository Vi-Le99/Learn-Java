package OOP;

import java.util.List;

public class Teacher extends People{
	private List<Student> studentList;

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Name: "+ getName()+", list student:"+studentList;
	}
}
