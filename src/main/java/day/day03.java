package day;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		String	str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}

}
