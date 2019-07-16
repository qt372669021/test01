package day;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String>  list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		System.out.print("{");
		for(int i=0;i<list.size();i++) {
			String  str=list.get(i);
			if(i== list.size()-1) {
				System.out.print(str+"}");
			}else {
				System.out.print(str+"@");
			}
		}

	}

}
