package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableEx {
	public static void main(String[] args) {
		
		List<Student> sc=new ArrayList<>();
		sc.add(new Student(1,"rahul","pawar",23));
		sc.add(new Student(29,"roshan","gosawi",33));
		sc.add(new Student(30,"gopal","jadav",20));
		sc.add(new Student(4,"aman","rahut",25));
		
	    Collections.sort(sc);
	    for(Student s:sc) {
	    	System.out.println(s.getId()+" : "+s.getName());
	    }
	}

}
