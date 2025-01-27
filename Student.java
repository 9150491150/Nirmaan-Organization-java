package School;

public class Student {
	private int id;
	private String name;
	private int rollno;
	private long phno;
	
	public Student(int id,String name,int rollno,long phno) {
		this.id=id;
		this.name=name;
		this.rollno=rollno;
		this.phno=phno;
	}
	public Student() {
	
	}
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", phno=" + phno + "]";
	}
	

	

}
