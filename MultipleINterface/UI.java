package MultipleInterface;

public class UI implements Calculator1 {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition:"+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction:"+(a-b));
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication:"+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division:"+(a/b));
		
	}
	public static void main(String[]args) {
		UI calc=new UI();
		calc.add(5, 10);
		calc.sub(5, 10);
		calc.mul(5, 10);
		calc.div(5, 10);
		
		Calculator1.display();
		
		UI cal=new UI();
		cal.Calculator();
		
		
	}
	
	
	

}
