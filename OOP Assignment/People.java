package OOP;

public class People {
	private String name = "";
	private int old;
	private int id;

	public String getName() {
		return name;
	}

	public int getOld() {
		return old;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Name=" + name + ", old=" + old + ", id=" + id;
	}
}
