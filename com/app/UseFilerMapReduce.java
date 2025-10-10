package com.app;

import java.util.Arrays;
import java.util.List;

public class UseFilerMapReduce {
public static void main(String[] args) {
	
	List<Integer> sc=Arrays.asList(1,2,3,4,5,6);
	Integer sc1=sc.stream().filter(x->x%2==0).map(x->x*x).reduce(0, (a,b)->a+b);
	Integer sc2=sc.stream().filter(x->x%2==0).map(x->x*x).reduce(0, Integer::sum);
	System.out.println(sc1);
	System.out.println(sc2);
}
}
