package Anonymous;

class classA{
	public void display() {
		for(int i=0;i<=100;i++) {
			System.out.println("class A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class classB{
	public void display() {
		for(int i=0;i<=100;i++) {
			System.out.println("class B");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Mt {
	public static void main(String[]args) {
		classA a=new classA();
		classB b=new classB();
		/*Thread tr1=new Thread() {
			@Override
			public void run() {
				a.display();
			}
		};
		Thread tr2=new Thread() {
			@Override
			public void run() {
				b.display();
			}
		};*/
		Runnable r1=new Runnable() {
			public void run() {
				a.display();
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				b.display();
			}
		};
		Thread tr1=new Thread(r1);
		Thread tr2=new Thread(r2);
		
		
		tr1.start();
		tr2.start();
	}

}
