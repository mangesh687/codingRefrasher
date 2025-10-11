package com.app;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstoccurance {
	public static void main(String[] args) {
		String str ="abcabcdf";
		Map<Character, Integer> sc=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			sc.put(str.charAt(i),sc.getOrDefault(str.charAt(i), 0)+1);
			
		}
		
		for(int i=0;i<str.length();i++) {
			if(sc.get(str.charAt(i))==1) {
				System.out.println("non repating charater : "+str.charAt(i));
				break;
			}
		}
	}

}
