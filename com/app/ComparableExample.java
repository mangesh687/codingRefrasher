package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		List<Emp> sc=new ArrayList<>();
		sc.add(new Emp(1,"rahul","pawar",23));
		sc.add(new Emp(29,"roshan","gosawi",33));
		sc.add(new Emp(30,"gopal","jadav",20));
		sc.add(new Emp(4,"aman","rahut",25));
		
		  Collections.sort(sc,new Emp());
	        sc.forEach(System.out::println);
		
		
	}

}
