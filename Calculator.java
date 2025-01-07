 package day8;

public class Calculator {
	int Firstnum;
	int Secondnum;
	void add() {
		System.out.println("Add:"+(Firstnum+Secondnum));
	}
	void sub() {
		System.out.println("sub:"+(Firstnum-Secondnum));
	}
	void mul() {
		System.out.println("mul:"+(Firstnum*Secondnum));
	}
	void div() {
		System.out.println("div:"+(Firstnum/Secondnum));
	}
	void mod() {
		System.out.println("mod:"+(Firstnum%Secondnum));
	}
	public static void main(String[]args) {
		Calculator calci=new Calculator();
		calci.Firstnum=10;
		calci.Secondnum=20;
		calci.add();
		calci.sub();
		calci.mul();
		calci.div();
		calci.mod();
	}
	

}
