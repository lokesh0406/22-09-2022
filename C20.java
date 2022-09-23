package com.collections.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class C20 {

	public static void main(String[] args) {
	
		HashMap entry = new HashMap();
		
		entry.put(1, "raja");
		
		entry.put(2, "java");
		entry.put(3, "python");
		entry.put(4, "asp");
		
		entry.put(null, "asp");
		
		entry.put(5, "c");
		
		System.out.println(entry);
		
		
		System.out.println(entry.get(4));
		
		System.out.println(entry.get("key"));
		
		System.out.println(entry.get(true));
		System.out.println(entry.get("lang"));
		
		Set key = entry.keySet();
		
		System.out.println(key);
		
		Iterator mapread =key.iterator();
		Object objkey,value;
		
		while(mapread.hasNext())
		{
			objkey=mapread.next();
			value = entry.get(objkey);
			
			System.out.println(objkey + ", "+value);
			
		}
		
		
		Hashtable ht = new Hashtable();
		
		ht.put("abc","value 1");
		ht.put(1,"value 1");
		
		
		System.out.println(ht);
	
	}

}
