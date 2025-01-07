package day8;

public class Employee {
	String name;
	int id;
	long mobileno;
	double salary;
	public static void main(String[]args) {
		Employee em1=new Employee();
		em1.name="Pavi";
		em1.id=7;
		em1.mobileno=9150491150l;
		em1.salary=0.0000d;
		
		Employee em2=new Employee();
		em2.name="Sakthi";
		em2.id=24;
		em2.mobileno=9345749943l;
		em2.salary=40000d;
		
		
		Employee em3=new Employee();
		em3.name="Sangeetha";
		em3.id=21;
		em3.mobileno=9840013313l;
		em3.salary=250000.0d;
		
		
		Employee em4=new Employee();
		em4.name="Anandh";
		em4.id=27;
		em4.mobileno=9443322637l;
		em4.salary=70000d;
		
		System.out.println("Emoloyee name:"+em4.name);
		System.out.println("Employee id:"+em4.id);
		System.out.println("Employee mobileno:"+em4.mobileno);
		System.out.println("Employee salary:"+em4.salary);
		
		
		
		
	
		
		
	}

}
