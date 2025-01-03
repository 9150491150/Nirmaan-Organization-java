package day10;

public class ConstructorExample {
	int carid;
	String carname;
	ConstructorExample(int carid,String carname){
		this.carid=carid;
		this.carname=carname;
	}
	ConstructorExample(){
	}
	public static void main(String[]args) {
		ConstructorExample car1=new ConstructorExample(743,"ford");
		System.out.println(car1.carid+" "+car1.carname);
		ConstructorExample car2=new ConstructorExample();
		car2.carid=347;
		car2.carname="figo";
		System.out.println(car2.carid+" "+car2.carname);
		
		
		
	}
	
	

}
