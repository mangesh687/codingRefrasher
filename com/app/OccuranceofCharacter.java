package com.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceofCharacter {
	public static void main(String[] args) {
		String str="java";
		
		Map<Character, Integer> sc=new LinkedHashMap<>();
	
		for(int i=0;i<str.length();i++) {
		
			sc.put(str.charAt(i), sc.getOrDefault(str.charAt(i),0 )+1);
		}
		System.out.println(sc);
	}

}
