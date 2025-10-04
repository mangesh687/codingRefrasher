package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Emp> sc=new ArrayList<>();
		sc.add(new Emp(1,"rahul","pawar",23));
		sc.add(new Emp(29,"roshan","gosawi",33));
		sc.add(new Emp(30,"gopal","jadav",20));
		sc.add(new Emp(4,"aman","rahut",25));
		
		  Collections.sort(sc,new Emp());
	        sc.forEach(System.out::println);
	        // 2. Descending by Name using Comparator.comparing + reversed (Java 8)
	        sc.sort(Comparator.comparing(Emp::getName).reversed());
	        System.out.println("\nDescending by Name:");
	        sc.forEach(System.out::println);

	        // 3. Descending by Age using Lambda
	        sc.sort((e1, e2) -> e2.getAge() - e1.getAge());
	        System.out.println("\nDescending by Age:");
	        sc.forEach(System.out::println);
		
		
	}

}
