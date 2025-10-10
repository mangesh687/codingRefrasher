package com.app;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByPartioningBy {
	public static void main(String[] args) {
		List<String> words =
				List.of("apple", "banana",
				"cherry", "apricot", "blueberry");
		//Collectors.groupingBy()
		Map<Object, List<String>> sc=words.stream().collect(Collectors.groupingBy(x->x.charAt(0)));
		System.out.println(sc);
		//{a=[apple, apricot], b=[banana, blueberry], c=[cherry]}
Map<Boolean, List<String>> sc1=words.stream().collect(Collectors.partitioningBy(x->x.length()>6));
System.out.println(sc1);
//{false=[apple, banana, cherry], true=[apricot, blueberry]}

	}

}
