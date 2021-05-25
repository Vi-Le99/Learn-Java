package OOP;

public class Student extends People {
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	
	public String toStringTeacher() {
		return "Student's name: " + getName() + ", teacher's name: " + teacher.getName();
	}
	@Override
	public String toString() {
		return getName() + " " ;
	}
}
