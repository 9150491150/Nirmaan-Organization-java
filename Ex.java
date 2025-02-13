package ExceptionalHandling;
import java.util.Scanner;
public class Ex {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	void mul(int a,int b) {
		System.out.println(a*b);
	}
	void div(int a,int b)throws Exception{
		Thread.sleep(1000);
		System.out.println(a/b);
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try {
			if(age<=18) {
				throw new Exception("Age is lessthan 18");
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Enter the correct age");
		}
		
		
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		
		Ex ob=new Ex();
		ob.add(num1, num2);
		ob.sub(num1, num2);
		ob.mul(num1, num2);
		
		try {
			ob.div(num1, num2);
		}catch(Exception e) {
			System.out.println(e);
		}
		}
		
		
	}
	
	
	
	
	
	
	
	

