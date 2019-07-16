package day;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 使用字节输出流的使用步骤：
 * 1.创建输出流的对象FileOutputStream,构造方法中传递输出数据的目的地；
 * 2.调用write()方法，把数据写入到文件中；
 * 3.释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）；
 * @author pc
 *
 */
public class FileOutPutStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new  FileOutputStream("D://a.txt",true);
		byte[] bytes="你好12".getBytes();
		fos.write(bytes);
		fos.write("\r\n".getBytes());//换行符
		fos.close();
	}

}
