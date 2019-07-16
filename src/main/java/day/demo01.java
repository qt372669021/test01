package day;

import java.io.FileReader;
import java.io.IOException;

public class demo01 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D://a.txt");
//		//1.单个字符读取
//		int len=0;
//		while((len=fr.read())!=-1) {
//			System.out.print((char)len);
//		}
		
		int len=0;//记录每次读取有效字符个数
		//读取多个字符，将字符读入数组
		char[] c=new char[1024];
		while((len=fr.read(c))!=-1) {
			System.out.println(new String(c,0,len));
		}

	}

}
