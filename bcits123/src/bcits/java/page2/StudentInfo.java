package bcits.java.page2;

public class StudentInfo {
	private int id;
	private	String name;
	private	double marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentInfo : \n 	id=" + id + "\n 	name=" + name + "\n	marks=" + marks;
	}
	
}
