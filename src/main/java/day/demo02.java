package day;

import java.io.FileWriter;
import java.io.IOException;

public class demo02 {

	public static void main(String[] args) throws IOException {
		//字符输出流
		FileWriter fw=new FileWriter("a.txt");
//		fw.write("你好吗？");
		//将字符写入到缓冲区
//		fw.write(97);
//		char[] c="你好大爷！！！".toCharArray();
//		fw.write(c);
		for(int i=1;i<10;i++) {
			fw.write("大爷好"+i+"\r\n");
		}
		fw.flush();
		fw.close();
	}

}
