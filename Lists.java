package com.qa.qacommunity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lists {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Zayn");
		names.add("James");
		names.add("George");
		names.add("John");
		names.add("Angelica");
		names.add("Pawel");

		System.out.println(names);
		System.out.println(names.get(1));

		names.set(1, "Aswene");
		names.remove(4);

		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		System.out.println(names.size());

		for (String name : names) {
			System.out.println(name);
		}
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}

		Collections.swap(names, 0, 5);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		names.clone();
		
		
		List<String> names2 = List.of("James", "George", "Bob");
		System.out.println(names2);
	}
}