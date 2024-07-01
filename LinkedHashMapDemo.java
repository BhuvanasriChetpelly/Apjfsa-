package apjfsa;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String args[]) {
		
		LinkedHashMap<String,Integer> countryCodes=new LinkedHashMap<String,Integer>();
		
		countryCodes.put("US",01);
		countryCodes.put("India",91);
		countryCodes.put("Russia",07);
		countryCodes.put("Australia",61);
		countryCodes.put("China",86);
		countryCodes.put("Pakisthan",92);
		
		System.out.println(countryCodes);
		
		System.out.println(countryCodes.containsKey("US"));
		
		System.out.println(countryCodes.containsValue(23));
		
		System.out.println(countryCodes.hashCode());
		
		System.out.println(countryCodes.size());
		
		System.out.println(countryCodes.get("India"));
		
		System.out.println(countryCodes.entrySet());
		
		System.out.println(countryCodes.keySet());
		
		System.out.println(countryCodes.values());
	
	}
}
