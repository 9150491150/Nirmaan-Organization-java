package day13;

class Employee {
	private int id;
	private String name;
	private double salary;
	private long mobileno;
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setMobileNo(long mobileno) {
		this.mobileno=mobileno;
	}
	
	public long getMobileNo() {
		return mobileno;
	}
	
	public String toString() {
		return "Employee id :"+id+"\nEmployee name:"+name+"\nEmployee salary:"+salary+"\nEmployee mobileno:"+mobileno;
	}
}
	
	public class EmployeeGS{
		public static void main(String[] args) {
			
			Employee gs=new Employee();
			gs.setId(743);
			System.out.println(gs.getId());
			gs.setName("Pavi");
			System.out.println(gs.getName());
			gs.setSalary(250000.00);
			System.out.println(gs.getSalary());
			gs.setMobileNo(9150491150l);
			System.out.println(gs.getMobileNo());
			System.out.println(gs);
			
			
			
			
		}
	}
	
	
	


