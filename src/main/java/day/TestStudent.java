package day;

import java.util.Random;
import java.util.Scanner;

public class TestStudent {
	 public static  void  main(String[]  args) {
		 Student  stu=new Student();
		 stu.setAge(20);
		 stu.setName("����");
		 System.out.println(stu);
		
		 
		 Random r=new Random();
		int  i= r.nextInt(10);
		System.out.println(i);
		 Scanner sc=new Scanner(System.in);
		while(true) { 
			System.out.println("����������֣�");
			int guest=sc.nextInt();
		 if(guest>i) {
			 System.out.println("����");
		 }else if(guest <i) {
			 System.out.println("С��");
		 }else {
			 System.out.println("����");
			 break;
		 }
		 
		}
		System.out.println("over");
	 }

}
