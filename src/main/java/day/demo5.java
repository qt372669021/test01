package day;

import redis.clients.jedis.Jedis;

public class demo5 {

	public static void main(String[] args) {
		Jedis  j=new Jedis("127.0.0.1",6379);
		j.set("name", "уекуди");
		String str=j.get("name");
		System.out.println(str);
		j.close();
		
	}

}
