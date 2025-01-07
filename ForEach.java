package day11;

import java.util.Scanner;

public class ForEach {
	boolean Isvalid(int age) {
		if((age>=18)&&(age<=100)) {
			return true;
		}
		return false;
	}
	public static void main(String[]args) {
		/*int[] nums= {1,2,3,4,5};
		int l=nums.length;
		for(int num:nums) {
			System.out.println(num);
		}
	}*/
	/*int[] nums=new int[6];
	nums[0]=1;
	nums[1]=2;
	nums[2]=3;
	nums[3]=4;
	nums[4]=5;
	nums[5]=6;
	int total=0;
	for(int  num:nums) {
		total +=num;
	}
		System.out.println(total);
	}*/

	
	Scanner sc=new Scanner(System.in);
	ForEach fe=new ForEach();
	System.out.println("Enter your age:");
	int age=sc.nextInt();
	if(fe.Isvalid(age)) {
		System.out.println("ELIGIBLE");
	}else {
		System.out.println("NOT ELIGIBLE");
	}

}
}



