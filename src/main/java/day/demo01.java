package day;

import java.io.FileReader;
import java.io.IOException;

public class demo01 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D://a.txt");
//		//1.�����ַ���ȡ
//		int len=0;
//		while((len=fr.read())!=-1) {
//			System.out.print((char)len);
//		}
		
		int len=0;//��¼ÿ�ζ�ȡ��Ч�ַ�����
		//��ȡ����ַ������ַ���������
		char[] c=new char[1024];
		while((len=fr.read(c))!=-1) {
			System.out.println(new String(c,0,len));
		}

	}

}
