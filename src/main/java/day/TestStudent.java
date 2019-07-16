package day;

import java.util.Random;
import java.util.Scanner;

public class TestStudent {
	 public static  void  main(String[]  args) {
		 Student  stu=new Student();
		 stu.setAge(20);
		 stu.setName("张三");
		 System.out.println(stu);
		
		 
		 Random r=new Random();
		int  i= r.nextInt(10);
		System.out.println(i);
		 Scanner sc=new Scanner(System.in);
		while(true) { 
			System.out.println("请输入的数字：");
			int guest=sc.nextInt();
		 if(guest>i) {
			 System.out.println("大了");
		 }else if(guest <i) {
			 System.out.println("小了");
		 }else {
			 System.out.println("对了");
			 break;
		 }
		 
		}
		System.out.println("over");
	 }

}
