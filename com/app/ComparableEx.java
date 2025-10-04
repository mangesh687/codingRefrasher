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
		
//	    Collections.sort(sc);
//	    for(Student s:sc) {
//	    	System.out.println(s.getId()+" : "+s.getName());
//	    }
//	    1 : rahul
//	    4 : aman
//	    29 : roshan
//	    30 : gopal
		
		Collections.sort(sc);
		sc.forEach(System.out::println);
//		Student [id=30, name=gopal, lastname=jadav, age=20]
//				Student [id=1, name=rahul, lastname=pawar, age=23]
//				Student [id=4, name=aman, lastname=rahut, age=25]
//				Student [id=29, name=roshan, lastname=gosawi, age=33]

	}

}
