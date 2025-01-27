package School;

import java.util.Scanner;

public class TeacherUI {
	public static void main(String[]args) {
		Teacher mam=new Teacher();
		while(true) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for show");
			System.out.println(" 0 for exit");
			int key=sc.nextInt();
			switch(key) {
			case 1:{
				System.out.println("Enter your id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your name");
				String name=sc.nextLine();
				System.out.println("Enter your salary");
				double salary=sc.nextDouble();
				sc.nextLine();

				System.out.println("Enter your phno ");
				long phno=sc.nextLong();
				sc.nextLine();

				mam=new Teacher(id,name,phno,salary);
				break;
				
				}
			case 2: {
				System.out.println("1 for modify id:");
				System.out.println("2 for modify name:");
				System.out.println("3 for modify salary:");
				System.out.println("4 for modify phno:");
				
				int keys=sc.nextInt();
				if(keys==1) {
					System.out.println("Enter the id");
					int id=sc.nextInt();
					mam.setId(id);
					
				}
				else if(keys==2) {
					System.out.println("Enter the name");
					String name=sc.nextLine();
					mam.setName(name);
				}
				else if(keys==3) {
					System.out.println("Enter the salary");
					double id=sc.nextDouble();
					mam.setSalary(id);
				}
				else if(keys==4) {
					System.out.println("Enter the phno") ;
					long phno=sc.nextLong();
					mam.setPhno(phno);
				}
				else {
					System.out.println("Enter the crt input");
					break;
				}
			}
			case 3: {
				System.out.println(mam);
				break;
			
				
			}
			case 0: {
				System.out.println("Thank u");
				break;
			}
			default :{
				System.out.println("Enter the crt answer");
			}
	}

	}
	}
}


