package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		int keepGoing = 1;
		
		//Collection
		List<String> stringa = new ArrayList<>();
		
		
		//while for letting in new data from user
		while(keepGoing == 1) {
			System.out.print("inserisci un nuovo elemento nella lista dei desideri:");
			String s = in.next();
			
			stringa.add(s);
			
			System.out.println("vorresti inserire un altro elemento nella lista?\nSi-->1 || No-->0");
			keepGoing = in.nextInt();
		}
		// Sorting method
		stringa.sort(new StringComparator());
		for (String str : stringa) {
			
			System.out.println(str);
		}
		
		
		*/
		//set
		
		Set<String> stringaSet = new HashSet<>();
		System.out.print("inserisci una parola e ti verra restituita lettera"
				+ " per lettera senza ripetizioni: ");
		String word = in.nextLine();
		

		for (int i = 0; i < word.length(); i++) {
			stringaSet.add(Character.toString(word.charAt(i)));
		}
		System.out.println(stringaSet);
		
		
		//map
		
		Map<Integer, String> map = new HashMap<>();
		System.out.print("inserisci una parola e ti verra restituita lettera per lettera: ");
		String wordForMap = in.nextLine();
		
		for (int i = 0; i < wordForMap.length(); i++) {
			map.put(i, Character.toString(wordForMap.charAt(i)));
		}
		System.out.println(map);
		in.close();
	}
	
	public static class StringComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			
			int o1Count = 0;
			int o2Count = 0;
			
			String a = "a";
			String e = "e";
			String i = "i";
			String o = "o";
			String u = "u";
			
			for (int x = 0; x < o1.length(); x++) {
				
				if(o1.charAt(x) == a.charAt(0) 
					|| o1.charAt(x) == u.charAt(0) 
					|| o1.charAt(x) == e.charAt(0)
					|| o1.charAt(x) == i.charAt(0) 
					|| o1.charAt(x) == o.charAt(0)) {
					o1Count++;
				}
				
				if(o2.charAt(x) == a.charAt(0) 
						|| o2.charAt(x) == e.charAt(0) 
						|| o2.charAt(x) == i.charAt(0)
						|| o2.charAt(x) == o.charAt(0) 
						|| o2.charAt(x) == u.charAt(0)) {
						o2Count++;
				}
			
			}
			return o2Count - o1Count;
		}
		
	}
}	
