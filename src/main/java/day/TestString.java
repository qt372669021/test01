package day;

import java.util.Arrays;

public class TestString {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "def";
		//两个字符串拼接
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		System.out.println(str3.contains(str1));
		
		System.out.println(str1.toCharArray()[0]);
	
		//数组转字符串
		int[] arra= {1,2,9,12,3,4,5};
		Arrays.sort(arra);
		String str=Arrays.toString(arra);
		System.out.println(str);
		
		//随机字符串按照升序排列
		String str6="abcdesvnlfljdljdjdfjmopu";
		char[] chars=str6.toCharArray();
		Arrays.sort(chars);
		for(char c:chars) {
			System.out.print(c);
		}
		System.out.println(" ");
		System.out.println("=======================");
		int i=Math.abs(-1);
		System.out.println(i);
		
		//-10.8到5.9之间绝对值大于6或者小于2.1的整数有多少个？
		
		double max=5.9;
		double min=-10.8;
		int count=0;
		for(int j=(int)min;j<max;j++) {
			int abs=Math.abs(j);
			if(abs>6 ||abs <2.1) {
				System.out.println(abs);
				count++;
			}
		}
		
		System.out.println("个数："+count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
