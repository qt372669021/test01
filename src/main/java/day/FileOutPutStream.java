package day;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * ʹ���ֽ��������ʹ�ò��裺
 * 1.����������Ķ���FileOutputStream,���췽���д���������ݵ�Ŀ�ĵأ�
 * 2.����write()������������д�뵽�ļ��У�
 * 3.�ͷ���Դ����ʹ�û�ռ��һ�����ڴ棬ʹ�����Ҫ���ڴ���գ��ṩ�����Ч�ʣ���
 * @author pc
 *
 */
public class FileOutPutStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new  FileOutputStream("D://a.txt",true);
		byte[] bytes="���12".getBytes();
		fos.write(bytes);
		fos.write("\r\n".getBytes());//���з�
		fos.close();
	}

}
