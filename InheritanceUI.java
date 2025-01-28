package Inheritance;

public class InheritanceUI {
	public static void main(String[]args) {
		Vehicle v=new Vehicle();
		//Single inheritance
		Car c=new Car();
		c.startEngine();
		//Multilevel
		Electriccar e=new Electriccar();
		e.ChargeBattery();
		e.drive();
		//Hierarchial
		Bike b=new Bike();
		b.startEngine();
		b.Kickstart();
	}
	

}
