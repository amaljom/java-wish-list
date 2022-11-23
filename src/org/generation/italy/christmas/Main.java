package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int keepGoing = 1;
		
		//Collection
		List<String> stringa = new ArrayList<>();
		
		while(keepGoing == 1) {
			System.out.print("inserisci un nuovo elemento nella lista dei desideri:");
			String s = in.next();
			
			stringa.add(s);
			
			System.out.println("vorresti inserire un altro elemento nella lista?\nSi-->1 || No-->0");
			keepGoing = in.nextInt();
		}
		Collections.sort(stringa);
		for (String str : stringa) {
			
			System.out.println(str);
		}
	}
}	
