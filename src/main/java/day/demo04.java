package day;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class demo04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
		HashMap<String,String> map=new HashMap<String,String>();
		String str;
		while((str=br.readLine())!=null) {
			String[] ss=str.split("\\.");
			map.put(ss[0], ss[1]);
		}
		for(String key:map.keySet()) {
			String value=map.get(key);
			str=key+"."+value;
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}
