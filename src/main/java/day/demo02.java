package day;

import java.io.FileWriter;
import java.io.IOException;

public class demo02 {

	public static void main(String[] args) throws IOException {
		//�ַ������
		FileWriter fw=new FileWriter("a.txt");
//		fw.write("�����");
		//���ַ�д�뵽������
//		fw.write(97);
//		char[] c="��ô�ү������".toCharArray();
//		fw.write(c);
		for(int i=1;i<10;i++) {
			fw.write("��ү��"+i+"\r\n");
		}
		fw.flush();
		fw.close();
	}

}
