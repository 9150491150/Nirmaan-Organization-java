package ExceptionalHandling;
import java.util.Scanner;
public class Ex {
	void add(int a, int b) {
		System.out.println(a+b);
	}

	void sub(int a, int b) {
		System.out.println(a-b);
	}

	void mul(int a, int b) {
		System.out.println(a*b);
	}

	void div(int a, int b) throws InterruptedException{
		Thread.sleep(7000);
		System.out.println(a/b);

	}

			

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try {
			if(age<-18) { 
				throw new ArithmeticException("Age is lessthan 18");
			}
			}
		catch(ArithmeticException e){
				System.out.println(e);
			}
		finally {
			System.out.println("Enter the correct age");
			}
		System.out.println("Enter the first number: ");
		int fnum=sc.nextInt();
		System.out.println("Enter the second number");
		int scnum=sc.nextInt();
		
		Ex ex1=new Ex();
		ex1.add(fnum, scnum);
		ex1.sub(fnum, scnum);
		ex1.mul(fnum, scnum);

		try {
			ex1.div(fnum,scnum);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
			}
		finally {
			System.out.println("Division ended");
		}
	

}
}

