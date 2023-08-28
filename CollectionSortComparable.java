package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortComparable {
	

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
	Collections.sort(list);
	list.forEach(System.out::println);
	Collections.sort(list, Comparator.reverseOrder());
	list.forEach(System.out::println);
}
		
	}
