package day;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
/**
 * 读取字节
 * @author pc
 *
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D://a.txt");
		FileOutputStream fos=new FileOutputStream("D://b.txt");
		//使用数组缓冲读取多个字节
		byte[] b = new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1) {
			System.out.println(new String(b,0,len));
	//		fos.write(b,0,len);
		}

		fis.close();

	}

}
