package com.rf.zzc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		hm.keySet();
		Iterator<Object> it = hm.keySet().iterator();
		while (it.hasNext()) {
			int a = (int) it.next();
			System.out.println("key=" + a + "  value=" + hm.get(a));
		}
		
		
//		Set<Map.Entry<String, String>> enteySet = map.entrySet();
//	    
//	    Iterator<Map.Entry<String, String>> it = enteySet.iterator();
//	    
//	    while(it.hasNext()){
//	        Map.Entry<String, String> mm = it.next();
//	        String key = mm.getKey();
//	        String value = mm.getValue();
//	        System.out.println(key+"   "+value);
//	    }
		

	}

}
