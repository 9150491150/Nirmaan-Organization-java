package day1;

public class Operators {
	public static void main(String[] args) {
		int num1=12;
		System.out.println("Enter the First number:"+num1);
		int num2=25;
		int num3=50;
		int num4=100;
		int num5=10;
		int num6=5;
		System.out.println("Enter the second number:"+num2);
		System.out.println(" ");
		System.out.println("Arithmetic Operations:");
		System.out.println("Addition:"+(num1+num2));
		System.out.println("Subtraction:"+(num1-num2));
		System.out.println("Multiplication:"+(num1*num2));
		System.out.println("Division:"+(num1/num2));
		System.out.println("Modulus:"+(num1%num2));
		System.out.println(" ");
		System.out.println("Relational Operations:");
		System.out.println("12>25:"+(num1>num2));
		System.out.println("12<25:"+(num1<num2));
		System.out.println("12>=25:"+(num1>=num2));
		System.out.println("12<=25:"+(num1<=num2));
		System.out.println("12==25:"+(num1==num2));
		System.out.println("12!=25:"+(num1!=num2));
		System.out.println(" ");
		System.out.println("Logical Operations:");
		System.out.println("(12>10 AND 25<50):"+((num1>num5)&&(num2<num3)));
		System.out.println("(12<5 OR 25>100):"+((num1<num6)||(num2>num4)));
		System.out.println(" ");
		System.out.println("Assignment Operations:");
		System.out.println("Initial value:"+num5);
		
		System.out.println("After += :"+(num5+=num1));
		System.out.println("After -= :"+(num5-=num1));
		System.out.println("After *= :"+(num5*=num1));
		System.out.println("After /= :"+(num5/=10));
		System.out.println("After %= :"+(num5%=12));
		System.out.println(" ");
		System.out.println("Unary Operations:");
		System.out.println("Initial value:"+12);
		System.out.println("After increment:"+ (++num1));
		System.out.println("After decrement:"+(--num1));
		System.out.println(" ");
		System.out.println("Conditonal Operation:");
		String str=(num1%2==0)?"Even":"odd";
		System.out.println(num1 +("is Even"));
		
		
		
	}

}
