package day;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
/**
 * ��ȡ�ֽ�
 * @author pc
 *
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D://a.txt");
		FileOutputStream fos=new FileOutputStream("D://b.txt");
		//ʹ�����黺���ȡ����ֽ�
		byte[] b = new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1) {
			System.out.println(new String(b,0,len));
	//		fos.write(b,0,len);
		}

		fis.close();

	}

}
